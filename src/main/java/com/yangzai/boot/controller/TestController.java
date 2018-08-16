package com.yangzai.boot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class TestController {
	@Value("${test.name}")
	public String test_name;
	@Value("${test.password}")
	public String test_pasword;
	
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String test(){
        return test_name+"-"+test_pasword;
    }
    @RequestMapping(value = "/force", method = RequestMethod.GET)
    public String force(){
    	return test_name+"-"+test_pasword;
    }
}