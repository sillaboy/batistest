package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.AdminMapper;
import com.test.model.Admin;

@Service("userService")
public class AdminServiceImpl implements AdminService {

	private AdminMapper adminMapper;
	
	
	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	@Autowired
	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}


	public Admin getUserById(int id) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(id);
	}	

}
