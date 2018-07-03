package mx.contigo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import mx.contigo.pojo.Hello;

/*Restcontroller ayuda a no volver a poner @responsebody o requestBoddy, automaticamente
 * a través de jackson hace la serialización del objeto a un json
 * */
@RestController
public class HelloWorldRestController {

	/*Headers accept indica el valor que se espera que se regrese, en este caso un json*/
	@RequestMapping(value="/saluda", method = RequestMethod.GET, headers ="Accept=application/json")
	public Hello saluda (HttpServletRequest request, HttpServletResponse response) {
		System.out.println	("Entra");
		return new Hello(); 
	}
	@RequestMapping(value="/postSomething", method=RequestMethod.POST, headers = "Accept=application/json")
	public Hello postSomething(@RequestBody Hello requestBody) {
		System.out.println(requestBody.toString());
		return requestBody; 
		
	}
//	@RequestMapping(value="/postSomething", method = RequestMethod.POST , headers = "Accept=application/json")
//	public Hello postSomething(@RequestBody requestBody) {
//		
	
//	@JsonManagedReference
//	@JsonBackReference
//	@JsonIgnore
//	@ModelAttribute
//		return new Hello(); 
//	}
}
