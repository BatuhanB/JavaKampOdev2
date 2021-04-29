package kampOdev2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		
	}
	public void addCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adli kullanici " + student.getTakenLecture() + " dersini aldı.");
	}
}
