package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.entities.Student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        StudentDao st =(StudentDao) con.getBean("studentDao");
//        Student student =new Student(1012,"Rick Calvin","California");
//        int r= st.insert(student);
//        System.out.println("Done "+r);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean t=true;
        while(t)
        {
        System.out.println("Press 1 for Add new");
        System.out.println("Press 2 for Display all students");
        System.out.println("Press 3 for get detail of single student");
        System.out.println("Press 4 for delete students");
        System.out.println("Press 5 for update");
        System.out.println("Press 6 for Exit");
        
        try {
         int input =Integer.parseInt(br.readLine());
         switch(input) {
         case 1:
        	 System.out.println("User Id: ");
        	 int uid=Integer.parseInt(br.readLine());
        	 
        	 System.out.println("Name: ");
        	 String name=br.readLine();
        	 System.out.println("City: ");
        	 String city=br.readLine();
        	 
        	 Student us = new Student(uid,name,city);
        	 
        	 st.insert(us);
        	 System.out.println("Added");
         break;
         case 2:
        	List<Student> allStudent = st.getAllStudent();
        	for(Student so:allStudent )
        	{
        		System.out.println("Name: "+so.getStudentName());
        		System.out.println("Id: "+so.getStudentId());
        		System.out.println("City: "+so.getStudentCity());	
        	}
             break;
         case 3:
        	 System.out.println("Enter UserID ");
        	 int userID = Integer.parseInt(br.readLine());
        	 Student student = st.getStudent(userID);
        	 System.out.println("Name: "+student.getStudentName());
     		System.out.println("Id: "+student.getStudentId());
     		System.out.println("City: "+student.getStudentCity());	
             break;
         case 4:
        	 int userId = Integer.parseInt(br.readLine());
        	 st.deleteStudent(userId);
             break;
         case 5:
        	 System.out.println("User Id: ");
        	 int id=Integer.parseInt(br.readLine());
        	 
        	 System.out.println("Name: ");
        	 String sname=br.readLine();
        	 System.out.println("City: ");
        	 String scity=br.readLine();
        	 
        	 Student sus = new Student(id,sname,scity);
        	 
        	 st.updateStudent(sus);
        	 System.out.println("Updated");
             break;
         case 6:
        	 t=false;
             break;
        	 default: 
        	 {
        		 System.out.println("Invalid Input");
        	 }
        		 
         }
        }
        catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        }
     }
}
