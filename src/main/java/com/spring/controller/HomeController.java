package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class HomeController  {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String  getHelloString(HttpServletRequest request, HttpServletResponse response) {

			return "helllo spring";
	     
	    }
}
