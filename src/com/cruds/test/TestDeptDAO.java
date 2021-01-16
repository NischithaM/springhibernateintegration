package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

public class TestDeptDAO {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DepartmentDAO dao=(DepartmentDAO) context.getBean("departmentDAO");
		
		dao.create(new Department(11,"HR"));
	}
}
