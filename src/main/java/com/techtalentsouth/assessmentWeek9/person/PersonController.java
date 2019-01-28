package com.techtalentsouth.assessmentWeek9.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techtalentsouth.assessmentWeek9.person.Person;

@Controller
public class PersonController {
	
	@Autowired
	private PersonRepository personRepo;
    
    @GetMapping("/")
    public ModelAndView showPeople() {
    	ModelAndView mv = new ModelAndView("index");
      	mv.addObject("people", personRepo.findAll());
      	return mv;
    }
    
    @GetMapping("/about")
    public ModelAndView about() {
    	ModelAndView mv = new ModelAndView("about");
    	return mv;
    }
    
    @PostMapping("/result")
	public ModelAndView createPerson(Person person) {
		ModelAndView mv = new ModelAndView("result");
		Person post = personRepo.save(person);
		mv.addObject("post", post);
		return mv;
	}
		
	@GetMapping("/person/new")
	public ModelAndView newPostForm(Person person) {
		ModelAndView mv = new ModelAndView("newPerson");
		mv.addObject("person", person);
		return mv;
	}
}
