package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
//	this is view name like index.jsp
	public String home(){
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");
		return "about";
	}

}
