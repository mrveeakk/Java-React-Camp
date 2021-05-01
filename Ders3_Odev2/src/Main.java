
public class Main {

	public static void main(String[] args) {
		//Instructor
		String [] lessons = {"Java","C#","Javascript"};
		String[] quizs = {"Abstarct Quiz","Inheritance Quiz"};
		Instructor instructor= new Instructor(1, "Fethi", "Hamarattürk", "1234", lessons, quizs);
		 InstructorManager insmanager= new InstructorManager();
		 insmanager.Login(instructor);
		 insmanager.LessonsList(instructor);
		 insmanager.QuizList(instructor);
		 System.out.println("------------------");
		 
		//Student
		 String [] lessonstudent = {"Java","React","Angular"};
		 int[] scores = {50,60,90};
		 Student student =new Student(2, "Merve", "Ak", "4567", lessonstudent, scores);
		 StudentManager stumanager=new StudentManager();
		 stumanager.Login(student);
		 stumanager.LessonsList(student);
		 stumanager.Scores(student);
		 

	}

}
