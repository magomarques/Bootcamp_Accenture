package com.eam.Project_Bootcamp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController implements ErrorController{
	
	@GetMapping("/")
	   public ModelAndView index(){
	   return new ModelAndView("index.html");
	}
	
	@GetMapping("/addEmployee")
	   public ModelAndView addEmployee(){
	   return new ModelAndView("addEmployee.html");
	}
	
	@GetMapping("/addScheduling")
	   public ModelAndView addScheduling(){
	   return new ModelAndView("addScheduling.html");
	}

	private final static String PATH = "/error";
    @RequestMapping(PATH)
    @ResponseBody
    public String getErrorPath() {
        return "Página não encontrada.";
    }
		
}
