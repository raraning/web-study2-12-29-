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


	// void �� ���� Ÿ���� ���

	@RequestMapping("doA")

	public void doA() {

		System.out.println("doA =syso================");

		logger.info("doA =logger================");		

		//doA.jsp ã�´�.

	}
	
	// String �� ���� Ÿ���� ���

		@RequestMapping("doB")

		public String doB(@ModelAttribute("msg") String msg2) {

			//�޼��� �ȿ��� ���� ��� String msg2 ó���ؼ� ��� ����

			logger.info("=msg=:"+msg2);



			return "result"; //doB.jsp �� �ƴ� result.jsp �� ã�Եȴ�.

		}
		
		
		// ��� ����Ÿ�� �����ؾ� �� ���

		@RequestMapping("doD")

		public String doD(Model model) {

			logger.info("doD called ................... ");		



			ProductVO a= new ProductVO();		



			a.setName("Product Name"); //��ǰ��

			a.setPrice(10000); //����



			model.addAttribute(a); // ��ü - �������� �����Ƿ� ������ �ڵ����� productVO �� �ȴ�.

			//model.addAttribute("product", a); //����, ��ü		



			return "productDetail";

		}
		
		// �����̷�Ʈ �ؾ� �� ���

		@RequestMapping("doE")

		public String doE(RedirectAttributes rttr) {

			logger.info("doE called ... and redirect to deF called ................... ");



			//redirect: ���� �� �� ���� �� ��� addFlashAttribute()�� ���� �����ؾ� �Ѵ�.

			rttr.addFlashAttribute("msg", "�޼�����~");
			rttr.addAttribute("id", "dancepkt"); //get������� ����


			return "redirect:doF?age=18";

		}	



		@RequestMapping("doF")

		public String doF(@ModelAttribute("msg") String msg, @ModelAttribute("id") String id) {

			logger.info("doF called ................... " + msg);

			

			return "result";

		}
		
		// JSON ����Ÿ�� �����ϱ� ���ؼ� @ResponseBody �߰��ؾ� �Ѵ�.

		@RequestMapping("doJSON")

		public @ResponseBody ProductVO doD() {

			logger.info("doJSON called ................... ");



			ProductVO product = new ProductVO();	



			product.setName("Sample Product");

			product.setPrice(10000);



			return product; //��ü ����

		}

}
