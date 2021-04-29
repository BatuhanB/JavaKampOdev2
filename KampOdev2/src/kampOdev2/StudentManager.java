package kampOdev2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı eklendi");
	}
	public void addCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlı kullanıcı" + student.getTakenLecture() + " dersini aldı.");
	}
}
