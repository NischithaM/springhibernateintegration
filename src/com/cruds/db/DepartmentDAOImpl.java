package com.cruds.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public void create(Department d) {
		
		Session session=sessionfactory.openSession();
		
		session.beginTransaction();
		session.save(d);
		session.getTransaction().commit();
		session.close();
				
		
	}
	
	
	
}
