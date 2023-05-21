package springMvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
//	this is view name like index.jsp
	public String home(Model model){
		System.out.println("this is home url");
		model.addAttribute("name","tipu");
		model.addAttribute("id",1412);
		
		List<String> freinds=new ArrayList<String>();
		freinds.add("vandana");
		freinds.add("roshni");
		freinds.add("ABC");
		model.addAttribute("f",freinds);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help controller");
		ModelAndView modelview=new ModelAndView();
//		setting the data
		modelview.addObject("name","uttam");
		modelview.addObject("roll no",1234);
		LocalDateTime now=LocalDateTime.now();
		modelview.addObject("time",now);
		
//		marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(3433);
		list.add(2134);
		list.add(2345);
		
		modelview.addObject("marks",list);
		
//		setting view name
		modelview.setViewName("help")
		return modelview;
	}

}
