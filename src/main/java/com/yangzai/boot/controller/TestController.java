package com.yangzai.boot.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangzai.boot.config.EtaConfig;

@RestController
@RequestMapping(value = "/api/employee")
public class TestController {
	@Resource
	private EtaConfig etaConfig;
	
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String test(){
        return etaConfig.getClientId()+etaConfig.getClientSecret();
    }
    @RequestMapping(value = "/force", method = RequestMethod.GET)
    public String force(){
    	return etaConfig.getClientId()+etaConfig.getClientSecret();
    }
}