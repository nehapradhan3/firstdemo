package controller;

import model.Person;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {
	@RequestMapping("/person")
	public String person(Model model){
		Person p=new Person();
		p.setFirstName("Neha");
		p.setLastName("Pradhan");
		p.setAge(23);
		model.addAttribute("person",p);
		return"personview";
	}
	@ResponseBody
	@RequestMapping("/")
	String entry(){
		return"My Spring Boot App";
	}
}
