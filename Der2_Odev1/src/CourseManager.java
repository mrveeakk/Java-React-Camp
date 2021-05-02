
public class CourseManager {
	
	
	public void courseList(Courses courses) {
		System.out.println(courses.getCourseInstructor()+" "+" öğretmenin verdiği dersler:");
		
		courses.getCourseName().forEach((n) -> System.out.println(n));
//		for(int i=0;i<courses.getCourseName().size();i++) {
//			String a;
//			a=courses.getCourseName().toString();
//			System.out.println(a);
//		}
		
	}
	
	public void addCourse(Courses course,String lessons) {
		
		
		course.getCourseName().add(lessons);
		
		System.out.println("Eklenen ders: "+lessons);
		course.getCourseName().forEach((n) -> System.out.println(n));
		
	}
	
	public void studentCourse(Student student) {
		System.out.println("Öğrencimiz "+student.getName()+" "+student.getLastName());
		for(int i=0;i<student.getLessons().length;i++) {
			System.out.println(student.getLessons()[i]+" "+"dersini alıyor.");
		}
		
	}
	
	

}
