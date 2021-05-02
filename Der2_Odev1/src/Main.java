import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Instructor
		ArrayList<String> kurslar=new ArrayList<String>();
		kurslar.add("Java");
		kurslar.add("C#");
		
		Courses kurs=new Courses(1, kurslar, "Vecdi");
		CourseManager coursemng=new CourseManager();
		coursemng.courseList(kurs);
		coursemng.addCourse(kurs, "JavaScript");
		System.out.println("----------------");
		//Student
		String[] lessons= {"JavaScript","Python"};
		
		Student student=new Student(2, "Merve", "Ak", lessons);
		coursemng.studentCourse(student);

	}

}
