package org.zerock.web;



import java.sql.Connection;

import java.sql.DriverManager;



import org.junit.Test;



public class MySQLConnectionTest {



	//�ڹ� 1.6 �̻���ʹ� ���񽺷δ� ������� JDBC Driver�� �ڵ����� ��ϵ˴ϴ�.

	//�׷��� Class.forName("com.mysql.jdbc.Driver") ���� �ڵ带 ȣ������ �ʾƵ� �˴ϴ�. :)

	//http://docs.oracle.com/javase/6/docs/api/java/util/ServiceLoader.html



	//private static final String DRIVER = "com.mysql.jdbc.Driver";



	private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";	

	private static final String USER = "root";

	private static final String PW = "1111";

	

	@Test

	public void testConnection() throws Exception{

		

		//Class.forName(DRIVER);

		

		try{

			Connection con = DriverManager.getConnection(URL,USER,PW); //try �������� ��ü ���� 

			System.out.println(con); //��ü �ܼ� ���



			con.close(); 

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

}