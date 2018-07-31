package com.thinkopen.academy.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkopen.academy.Dao.StudentDao;
import com.thinkopen.academy.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
