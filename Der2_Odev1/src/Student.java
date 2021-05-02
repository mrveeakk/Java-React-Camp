
public class Student {
	private int StudentNo;
	private String Name;
	private String LastName;
	private String[] Lessons;
	public Student(int studentNo, String name, String lastName,String[] Lessons) {
		this.StudentNo = studentNo;
		this.Name = name;
		this.LastName = lastName;
		this.Lessons=Lessons;
	}
	public int getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(int studentNo) {
		this.StudentNo = studentNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String[] getLessons() {
		return Lessons;
	}
	public void setLessons(String[] lessons) {
		Lessons = lessons;
	}
	

}
