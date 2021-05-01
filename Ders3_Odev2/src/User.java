
public class User {
	private int id;
	private String Name;
	private String LastName;
	private String password;
	private String[] Lessons;
	public User(int id, String name, String lastName, String password,String[] Lessons) {
		this.id = id;
		this.Name = name;
		this.LastName = lastName;
		this.password = password;
		this.Lessons=Lessons;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getLessons() {
		return Lessons;
	}
	public void setLessons(String[] lessons) {
		Lessons = lessons;
	}
	

}
