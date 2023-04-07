package com.jsp.jese8.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.jese8.dao.EmpDao;
import com.jsp.jese8.dto.EmpDto;

@Controller
public class EmpController {
	/*-------------INSERT-------------------*/
	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView andView = new ModelAndView("signup.jsp");
		EmpDto dto = new EmpDto();
		andView.addObject("empobject", dto);
		
		return andView;
	}

	@ResponseBody
	@RequestMapping("/insert")
	public void savedata(EmpDto dto) {
		EmpDao dao = new EmpDao();
		dao.insert(dto);
	}

	/*-------------UPDATE-------------------*/
	@RequestMapping("/up")
	public ModelAndView update() {
		ModelAndView andView = new ModelAndView("update.jsp");
		EmpDto dto = new EmpDto();
		andView.addObject("empupdatekey", dto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/update")
	public void savedataa(int id, String role) {
		EmpDao dao = new EmpDao();
		dao.update(id, role);

	}

	/*-------------DELETE-------------------*/
	@ResponseBody
	@RequestMapping("/de")
	public ModelAndView delete() {
		ModelAndView andView = new ModelAndView("delete.jsp");
		EmpDto dto = new EmpDto();
		andView.addObject("deletekey", dto);
		return andView;

	}

	@ResponseBody
	@RequestMapping("/delete")
	public void deletee(int id) {
		EmpDao dao = new EmpDao();
		dao.delete(id);
	}

	/*-------------FETCH BY ID-------------------*/
	@ResponseBody
	@RequestMapping("/fetchh")
	public ModelAndView fetch() {
		ModelAndView andView = new ModelAndView("fetch.jsp");
		EmpDto dto = new EmpDto();
		andView.addObject("fetchkey", dto);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/fetch")
	public ModelAndView fetchh(int id) {
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.fetchbyId(id);

		ModelAndView andView = new ModelAndView("fetch111.jsp");
		andView.addObject("fetchbykey", dto);
		return andView;
	}
	/*-------------FETCH All-------------------*/
	@RequestMapping("/fetchall")
	public ModelAndView fetchAll() {
		EmpDao dao=new EmpDao();
		List<EmpDto>dto= dao.fetchAll();
		ModelAndView andView=new ModelAndView("fetchall.jsp");
		andView.addObject("fetchallkey",dto);
		return andView ;
		
	}
	

}
