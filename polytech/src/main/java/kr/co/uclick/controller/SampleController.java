package kr.co.uclick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.uclick.service.SampleService;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@RequestMapping(value = "sample.html")
	public String sample(Model model) {
		model.addAttribute("samples", sampleService.findAll());
		return "sample";
	}
}
