package kr.or.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.DepartDTO;
import kr.co.domain.MemberDTO;
import kr.co.service.DepartService;

@Controller
@RequestMapping("depart")
public class DepartController {

	@Inject
	private DepartService dService;
	
	
	/*
	 * @RequestMapping(value="/delete/{did}",method=RequestMethod.GET) public String
	 * delete(@PathVariable("did") String did) { dService.delete(did);
	 * 
	 * return "redirect:depart/list"; }
	 * 
	 */
	

}
