package com.example.start.demostart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class PageController {

	@GetMapping("/page01")
	public String page01(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("page", "page01");
		model.addAttribute("name", name);
        model.addAttribute("time", LocalDateTime.now());
		return "page01";
	}

    @GetMapping("/page02")
	public String page02(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("page", "page02");
		model.addAttribute("name", name);
		model.addAttribute("time", LocalDateTime.now());
		return "page02";
	}

    @GetMapping("/page03")
	public String page03(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("page", "page03");
		model.addAttribute("name", name);
		model.addAttribute("time", LocalDateTime.now());
		return "page03";
	}

    @GetMapping("/page04")
	public String page04(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("page", "page04");
		model.addAttribute("name", name);
		model.addAttribute("time", LocalDateTime.now());
		return "page04";
	}
}