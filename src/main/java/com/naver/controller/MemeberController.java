package com.naver.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.domain.LoginDTO;
import kr.co.domain.MemberDTO;
import kr.co.service.MemberService;



@Controller
@RequestMapping("member")  
//member/insert ,member/select이렇게 나옴


//배열 형태로 넣음
//@SessionAttributes({"id","pw"})
//모델에 login이라는 객체가 바인등 되어 있으면 sesion에 저장 하라
@SessionAttributes({"login"})
public class MemeberController {

	/*
	 * @Autowired private MemberService memberService;
	 */
	


	
	
	
	
}
