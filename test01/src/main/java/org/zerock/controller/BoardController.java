package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@GetMapping("/register")
	public void registerGET(BoardVO board) throws Exception{
		logger.info("register get=================");
	}
	
	@PostMapping("/register")
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("register post==================");
		logger.info(board.toString());
		
		service.regist(board);
		
		rttr.addFlashAttribute("msg","success");
		
		return "redirect:/board/listAll";
	}
	
	@GetMapping("/listAll")
	public void listAll(Model model) throws Exception{
		logger.info("show all list===================");
		model.addAttribute("list",service.listAll());
	}
	
	@GetMapping("/read")
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		logger.info("read get===================");
		model.addAttribute(service.read(bno));
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno);
		
		rttr.addFlashAttribute("msg","delete");
		
		return "redirect:/board/listAll";
	}
	
	@GetMapping("/modify")
	public void modifyGET(int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	@PostMapping("/modify")
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("mod post================");
		service.modify(board);
		
		rttr.addFlashAttribute("msg","modify");
		
		return "redirect:/board/listAll";
	}
	
	
	
	
	
	
	
	
	
	
}
