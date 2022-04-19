package org.zerock.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // 웹어플리케이션 실행 처리
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class SampleControllerTest {
private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);

	

	@Inject

	private WebApplicationContext wac;

	

	private MockMvc mockMvc;

	

	@Before //메소드 실행전에 먼저 처리해 달라는 에노테이션
	public void setup() {

		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		logger.info("setup() called ................... ");

	}

	

	@Test

	public void testDoa() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/doA"));

	}
}
