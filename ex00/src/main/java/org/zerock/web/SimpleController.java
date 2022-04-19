package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;


@Controller 

@RequestMapping("/sample/*")

public class SimpleController {

	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);	


	// void 가 리턴 타입일 경우

	@RequestMapping("doA")

	public void doA() {

		System.out.println("doA =syso================");

		logger.info("doA =logger================");		

		//doA.jsp 찾는다.

	}
	
	// String 이 리턴 타입일 경우

		@RequestMapping("doB")

		public String doB(@ModelAttribute("msg") String msg2) {

			//메서드 안에서 변수 사용 String msg2 처리해서 사용 가능

			logger.info("=msg=:"+msg2);



			return "result"; //doB.jsp 가 아닌 result.jsp 를 찾게된다.

		}
		
		
		// 결과 데이타를 전달해야 할 경우

		@RequestMapping("doD")

		public String doD(Model model) {

			logger.info("doD called ................... ");		



			ProductVO a= new ProductVO();		



			a.setName("Product Name"); //상품명

			a.setPrice(10000); //가격



			model.addAttribute(a); // 객체 - 변수명이 없으므로 변수는 자동으로 productVO 가 된다.

			//model.addAttribute("product", a); //변수, 객체		



			return "productDetail";

		}
		
		// 리다이렉트 해야 할 경우

		@RequestMapping("doE")

		public String doE(RedirectAttributes rttr) {

			logger.info("doE called ... and redirect to deF called ................... ");



			//redirect: 값을 한 번 전달 할 경우 addFlashAttribute()로 변수 전달해야 한다.

			rttr.addFlashAttribute("msg", "메세지다~");
			rttr.addAttribute("id", "dancepkt"); //get방식으로 전달


			return "redirect:doF?age=18";

		}	



		@RequestMapping("doF")

		public String doF(@ModelAttribute("msg") String msg, @ModelAttribute("id") String id) {

			logger.info("doF called ................... " + msg);

			

			return "result";

		}
		
		// JSON 테이타를 생성하기 위해서 @ResponseBody 추가해야 한다.

		@RequestMapping("doJSON")

		public @ResponseBody ProductVO doD() {

			logger.info("doJSON called ................... ");



			ProductVO product = new ProductVO();	



			product.setName("Sample Product");

			product.setPrice(10000);



			return product; //객체 리턴

		}

}
