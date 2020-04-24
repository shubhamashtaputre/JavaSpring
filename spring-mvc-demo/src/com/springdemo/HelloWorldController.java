package com.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//need a controller method to intialize the html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-world_form";
	}
	
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//here we are creating our model code
	@RequestMapping("/processFormUsingModel")
	public String sayMyName(HttpServletRequest request,Model model) {
		
		//read the request parameter form html page
		String theName = request.getParameter("studentName");
		
		//convert the data to capital letters
		theName = theName.toUpperCase();
		
		//add some message alone with the received message
		String newMessage = "Hello!!! "+theName;
		
		//add message to the model
		model.addAttribute("myModelMessage", newMessage);
		
		//this is our jsp page where we are going to display the data received from
		//the "hello-world_form.jsp" page. 
		return "helloworld";
		
	}
	
	
	
}






