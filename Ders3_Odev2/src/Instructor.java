
public class Instructor extends User {
	private String[] Quiz;
	
	public Instructor(int id, String name, String lastName, String password,String[] Lessons,String[] Quiz) {
		super(id, name, lastName, password,Lessons);
		this.Quiz=Quiz;
	}

	public String[] getQuiz() {
		return Quiz;
	}

	public void setQuiz(String[] quiz) {
		Quiz = quiz;
	}

}
