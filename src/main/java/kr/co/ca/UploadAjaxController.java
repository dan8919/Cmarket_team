package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.rmi.CORBA.Util;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.service.BoardService;
import kr.co.utils.Utils;

@Controller
public class UploadAjaxController {

	private String uploadPath="C:"+File.separator+"upload";
	
@Inject
	private BoardService bService;
	
	
	
	
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/getAttach/{bno}", method = RequestMethod.GET)
	 * public List<String> getAttach(@PathVariable("bno") Integer bno){
	 * 
	 * return bService.getAttach(bno);
	 * 
	 * }
	 */
	
	
	
	
	

	
}
