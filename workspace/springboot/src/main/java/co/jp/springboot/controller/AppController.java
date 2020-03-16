package co.jp.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@RequestMapping(value = "/top")
	public String hello(HttpServletRequest req) {
		req.setAttribute("message", "this is a top page");
		return "/top";
	}

	@RequestMapping(value = "/welcom")
	public @ResponseBody String welcome(HttpServletRequest req) {
		return "this is a welcome message";
	}
}
