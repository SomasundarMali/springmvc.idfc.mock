package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.StudentDao;
import dto.StudentDto;

@Controller
public class StudentController {

	@Autowired
	StudentDto dto;
	@Autowired
	StudentDao dao;

	@RequestMapping("/signup")
	public ModelAndView insert() {
		ModelAndView andView = new ModelAndView("insert.jsp");
		andView.addObject("insertkey", dto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/insert")

	public void dave(StudentDto dto) {
		dao.insert(dto);
	}

	
	
	@ResponseBody
	@RequestMapping("/fetch")
	public ModelAndView fetc() {

		ModelAndView andView = new ModelAndView("fetch.jsp");
		andView.addObject("fetchkey", dto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/fet")
	public ModelAndView fetchhh(int id) {
		StudentDto dto= dao.fetchbyid(id);
		ModelAndView andView=new ModelAndView("fetchpro.jsp");
		andView.addObject("fetchbykey",dto);
		return andView;
	}

}
