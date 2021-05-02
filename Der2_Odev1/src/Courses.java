import java.util.ArrayList;

public class Courses {
	private int id;
	private ArrayList<String> CourseName;
	private String CourseInstructor;
	
	public Courses(int id, ArrayList<String> courseName, String courseInstructor) {
		this.id = id;
		this.CourseName = courseName;
		this.CourseInstructor = courseInstructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<String> getCourseName() {
		return CourseName;
	}
	public void setCourseName(ArrayList<String> courseName) {
		this.CourseName = courseName;
	}
	public String getCourseInstructor() {
		return CourseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.CourseInstructor = courseInstructor;
	}
	

}
