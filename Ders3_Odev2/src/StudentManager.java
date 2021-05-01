
public class StudentManager extends UserManager {
	@Override
	public void LessonsList(User user) {
		super.LessonsList(user);
	}
	
	public void Scores(Student student) {
		System.out.println("Dersleri: "+student.getName());
		 for(int i=0;i< student.getLessons().length;i++) {
		      System.out.println(student.getLessons()[i] + ": "+student.getScore()[i]);
		    }

	}
}
