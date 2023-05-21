package dspringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dspringmvc.model.User;
import dspringmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Welcome to JTC India");
		m.addAttribute("Desc","learn Full StackDeveloper");
		System.out.println("common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header","Welcome to JTC India");
//		m.addAttribute("Desc","learn Full StackDeveloper");
		System.out.println("creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	
//1st way to get the data by httpservletrequest:
//	public String handleform(HttpServletRequest request) {
//		String email=request.getParameter("email");
//		System.out.println("your email is: "+email);
	
//	2nd way to get the data by using requestparam:
//	public String handleform(
//			@RequestParam(name="email",required = false) String UserEmail,
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String UserPassword,Model model) {
		
//		System.out.println("user email: "+ UserEmail);
//		System.out.println("user userName: "+ userName);
//		System.out.println("user password: "+ UserPassword);
		
//		User user=new User();
//		user.setEmail(UserEmail);
//		user.setUserName(userName);
//		user.setPassword(UserPassword);
//		System.out.println(user);
//		any process if there can be write here like database connection-
		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",UserEmail);
//		model.addAttribute("password",UserPassword);
		
//		model.addAttribute("user",user);
	
//	3rd way to get data:
	public String handleform(@ModelAttribute("user") User user,Model model) {
		System.out.println(user);
//		model.addAttribute("Header","Welcome to JTC India");
//		model.addAttribute("Desc","learn Full StackDeveloper");
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}

		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + createdUser);
		return "success";
		
	}

}
