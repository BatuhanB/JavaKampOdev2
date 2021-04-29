package kampOdev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGivenLecture("Java & React Kursu");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Batuhan");
		student.setLastName("Balı");
		student.setTakenLecture("Java & React Kursu");
		
		User[] user = {instructor,student};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(user);
		System.out.println();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(student);
		
 	}

}
