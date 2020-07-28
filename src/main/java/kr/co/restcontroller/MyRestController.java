package kr.co.restcontroller;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.domain.ReplyVO;
import kr.co.service.ReplyService;


@RestController
public class MyRestController {
	/*
	 * @Inject private ReplyService rService; //delete 삭제
	 * 
	 * @RequestMapping(value="/replies",method = RequestMethod.DELETE) public String
	 * delete(@RequestBody ReplyVO vo) {
	 * 
	 * int i=rService.delete(vo.getRno()); if(i==1) { return "success"; } return
	 * "fail"; }
	 */


}
