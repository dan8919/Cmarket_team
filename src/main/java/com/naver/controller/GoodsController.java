package com.naver.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.domain.GoodsVO;
import kr.co.service.GoodsService;

@Controller
@RequestMapping("goods")
public class GoodsController  {
	@Inject
	private GoodsService gService;
	
	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public void insert() {
		
	}
	
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insert(GoodsVO vo) {
            gService.insert(vo);
	
		
		return "redirect:/goods/list";
	} 
	
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public void goodsList(Model model) {
	List<GoodsVO> goodsList =	gService.goodsList();
	model.addAttribute("goodsList",goodsList);
	}
	
	
	//gno중복 체크 
	@ResponseBody
	@RequestMapping(value = "/checkGno",method = RequestMethod.POST)
	public String checkGno(String inputGno) {
	
		String result = "can use";
	  GoodsVO  vo = gService.getCheckGno(inputGno);
	   if(vo!=null) result = "change one";
	   else System.out.println("아이디 사용가능(result=0)일때");
		
     return result;		
	}

}
