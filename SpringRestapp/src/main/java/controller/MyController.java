package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Courses;

import services.CourseService;

@RestController
@RequestMapping("name")
public class MyController {
	@Autowired
	private CourseService cserv;
	
	@GetMapping("/home")
	public String goHome() {
		return "Hello";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return cserv.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.cserv.getCourse(Long.parseLong(courseId));
	}
/*	@PostMapping("/courses")
	public Courses addCourse(Courses course) {
		return this.cserv.addCourse(course);
	}*/
}
