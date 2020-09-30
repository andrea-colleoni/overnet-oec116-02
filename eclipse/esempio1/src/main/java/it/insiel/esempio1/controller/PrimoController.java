package it.insiel.esempio1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimoController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public @ResponseBody String hello() {
		return "Hello world!";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public @ResponseBody List<String> list() {
		var list = new ArrayList<String>();
		list.add("str 1");
		list.add("str 2");
		list.add("str 3");
		list.add("str 4");
		return list;
	}
	
}
