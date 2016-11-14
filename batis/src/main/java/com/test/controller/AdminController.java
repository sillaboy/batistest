package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Admin;
import com.test.service.AdminService;
import com.test.service.AdminServiceImpl;

@Controller
@RequestMapping("/adminController")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("/showAdmin/{id}")
	public String showAdmin(@PathVariable String id, HttpServletRequest request) {
		Admin admin = adminservice.getUserById(Integer.valueOf(id));
		request.setAttribute("user", admin);
		return "showAdmin";
	}
}
