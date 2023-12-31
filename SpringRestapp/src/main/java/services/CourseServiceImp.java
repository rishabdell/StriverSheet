package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Courses;




@Service
public class CourseServiceImp implements CourseService {
	List<Courses> list;
	
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Courses(145,"Java","Java Basics"));
		list.add(new Courses(1490,"Spring","Spring Basics"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c =null;
		for(Courses course: list)
		{
			if(course.getId()==courseId)
			{
				c= course;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		list.add(course);
		
		return course;
	}

}
