package org.zerock.web;



import java.sql.Connection;

import java.sql.DriverManager;



import org.junit.Test;



public class MySQLConnectionTest {



	//자바 1.6 이상부터는 서비스로더 기반으로 JDBC Driver가 자동으로 등록됩니다.

	//그래서 Class.forName("com.mysql.jdbc.Driver") 류의 코드를 호출하지 않아도 됩니다. :)

	//http://docs.oracle.com/javase/6/docs/api/java/util/ServiceLoader.html



	//private static final String DRIVER = "com.mysql.jdbc.Driver";



	private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";	

	private static final String USER = "root";

	private static final String PW = "1111";

	

	@Test

	public void testConnection() throws Exception{

		

		//Class.forName(DRIVER);

		

		try{

			Connection con = DriverManager.getConnection(URL,USER,PW); //try 구문에서 객체 생성 

			System.out.println(con); //객체 콘솔 출력



			con.close(); 

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

}