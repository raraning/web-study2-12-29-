package org.zerock.web;



import java.sql.Connection;



import javax.inject.Inject;

import javax.sql.DataSource;



import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



//아래 두개의 에노테이션은 현재 테스트 코드를 실행할 때 스프링이 로딩되도록 하는 부분

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(

		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DataSourceTest {



	//@Inject >> 범용:자바에서 지원, 연결방식:타입에 맞춰서 연결

	//스프링이 생성해서 주입처리된다.

	@Inject

	private DataSource ds;	



	@Test

	public void testConection() throws Exception{

		try {

			Connection con = ds.getConnection();

			System.out.println(con); //객체 주소값 출력

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

}