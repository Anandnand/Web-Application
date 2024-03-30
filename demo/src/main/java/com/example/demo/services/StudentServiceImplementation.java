package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentServices {

	@Autowired
	StudentRepository sr;
	
	
	@Override
	public String addStudent(Student st) {
		sr.save(st);
		return "Student Added Successfully!";
	}

	@Override
	public Student getStudent(int id) {
		Student st = sr.findById(id).get();
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> lst = sr.findAll();
		return lst;
	}

	@Override
	public String updateStudent(Student st) {
		sr.save(st);
		return "Student updated Successfully!";
	}

	@Override
	public String deleteStudent(int id) {
		sr.deleteById(id);
		return "Student deleted successfully!";
	}

}
