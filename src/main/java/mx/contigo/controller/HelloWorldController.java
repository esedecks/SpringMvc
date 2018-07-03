package mx.contigo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.contigo.pojo.Hello;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/saluda2", method = RequestMethod.GET, headers ="Accept=application/json")
	@ResponseBody
	public Hello saluda (HttpServletRequest request, HttpServletResponse response) {
		System.out.println	("Entra");
		return new Hello(); 
	}
	
	
}
