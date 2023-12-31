package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.dao.entities.Student;

public class StudentDao {
	private HibernateTemplate hib;
	
	@Transactional
	public int insert(Student student)
	{
		Integer i=(Integer)this.hib.save(student);
		return i;
	}
	
	public Student getStudent(int studentId) {
		Student student= this.hib.get(Student.class, studentId);
	return student;
	} 
	
	public List<Student> getAllStudent() {
		List<Student> students=this.hib.loadAll(Student.class);
		return students;
	}
	
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student=this.hib.get(Student.class, studentId);
		this.hib.delete(student);
	}
	
	@Transactional
	public void updateStudent(Student student)
	{
		//Student student=this.hib.get(Student.class, studentId);
		this.hib.update(student);
	}
	
	public HibernateTemplate getHib() {
		return hib;
	}
	public void setHib(HibernateTemplate hib) {
		this.hib = hib;
	}
	

}
