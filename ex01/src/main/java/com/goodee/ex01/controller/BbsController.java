package com.goodee.ex01.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.goodee.ex01.service.BbsService;

@Controller
public class BbsController {
	
	@Autowired
	private BbsService bbsService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/bbs/addPage")
	public String addPage()	{
		return "bbs/add";
	}
	
	@ResponseBody
	@PostMapping(value = "/bbs/uploadSummernoteImage", produces = "application/json")
	public Map<String, Object> uploadSummernoteImage(MultipartHttpServletRequest multipartRequest) {
		return bbsService.uploadSummernoteImage(multipartRequest);
	}
	
	
}
