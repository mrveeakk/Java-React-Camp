

public class UserManager {
	
	public void Login(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" sisteme giri� yapt�");
	}
	
	public void LessonsList(User user) {
		System.out.println("Dersleri: "+user.getName());
		 for(String lesson : user.getLessons()) {
		      System.out.print(lesson + ", ");
		    }
		System.out.println("");
	}

}
