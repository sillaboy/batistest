package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.Admin;
import com.test.model.User;
import com.test.service.AdminService;

public class TestAdmin {
	
	private ApplicationContext ctx;
	private AdminService adminService;
	
	@Before 
	public void Before() {
		ctx = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
		adminService = (AdminService)ctx.getBean("userService");
	}
	
	@Test
	public void test() {		
		Admin user = adminService.getUserById(1);
		System.out.println(user.getUserName());
	}
}
