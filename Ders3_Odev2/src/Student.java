
public class Student extends User{
	private int[] Score;

	public Student(int id, String name, String lastName, String password,String[] Lessons,int[] Score) {
		super(id, name, lastName, password,Lessons);
		this.Score=Score;

	}

	public int[] getScore() {
		return Score;
	}

	public void setScore(int[] score) {
		this.Score = score;
	}

}
