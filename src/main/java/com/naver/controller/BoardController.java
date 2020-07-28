package com.naver.controller;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;
import kr.co.service.BoardService;
import kr.co.utils.Utils;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Inject
	private BoardService bService;
	
	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public void insert() {
		
	}
	
	@RequestMapping(value = "/insert" , method = RequestMethod.POST)
	public String insert(BoardVO vo) {
	
		bService.insert(vo);
	
		
		return "redirect:/board/insert";
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public void boardList(Model model) {
    List<BoardVO>	boardList=	bService.boardList();
		model.addAttribute("boardList", boardList);
		
	}
	

	
	

	
	
}
