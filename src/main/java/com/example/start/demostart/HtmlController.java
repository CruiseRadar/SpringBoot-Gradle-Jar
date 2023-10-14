package com.example.start.demostart;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {
    

    @GetMapping("/htmlModel")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
        model.addAttribute("time", LocalDateTime.now());
		return "htmlModel";
	}

    @GetMapping("/inputtypes")
	public String inputTypes(Model model) {
        model.addAttribute("time", LocalDateTime.now());
		return "inputtypes";
	}

    @GetMapping("/jsonexp")
	public String jsonexp(Model model) {
        model.addAttribute("time", LocalDateTime.now());
		return "jsonexp";
	}

    @GetMapping("/reqapi")
	public String reqapi(Model model) {
        model.addAttribute("time", LocalDateTime.now());
		return "reqapi";
	}
}
