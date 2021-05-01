
public class InstructorManager extends UserManager {
	
	@Override 
	public void LessonsList(User user) {
		super.LessonsList(user);
		
	}
	
	@Override
	public void Login(User user) {
		super.Login(user);
	}
	
	public void QuizList(Instructor quizs) {
		 System.out.println(quizs.getName()+" "+"Öðretmenin Qizleri");
		for(int i=0;i<quizs.getQuiz().length;i++) {
			System.out.println(quizs.getQuiz()[i]);
		}
	}

}
