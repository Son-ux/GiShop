package com.sondh.gishop.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sondh.gishop.entity.UsersExample;
import com.sondh.gishop.mapper.UsersMapper;

@Controller
public class HomeController {
	
	@Autowired
	UsersMapper usersMapper;
	
	@RequestMapping(value = "/")
	public ModelAndView homePage() throws SQLException {
		System.out.println(usersMapper.countByExample(new UsersExample()));
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@GetMapping(value = "/login")
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView("login/login");
		return model;
	}
}
