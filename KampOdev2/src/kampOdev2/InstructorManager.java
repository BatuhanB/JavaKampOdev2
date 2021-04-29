package kampOdev2;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı eklendi.");
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlı kullanıcı " + instructor.getGivenLecture() + " dersini verdi.");
	}
}
