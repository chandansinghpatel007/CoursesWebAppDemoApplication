package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoursesController {
	/*
	 * @RequestMapping("/courses") public String courses(HttpServletRequest req) {
	 * HttpSession session =req.getSession(); String
	 * cName=req.getParameter("cName"); session.setAttribute("cName", cName); return
	 * "courses.jsp"; }
	 */
	
	/*
	 * @RequestMapping("/courses") public String courses(@RequestParam("cName")
	 * String courseName ,HttpSession session) { session.setAttribute("cName",
	 * courseName); return "courses.jsp"; }
	 */
	
	@GetMapping("/courses")
	public ModelAndView courses(@RequestParam("cName")String courseName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cName",courseName);
		mv.setViewName("courses.jsp");
		return mv;
	}
}
