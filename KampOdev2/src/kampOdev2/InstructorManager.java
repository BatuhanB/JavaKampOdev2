package kampOdev2;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlı kullanıcı " + instructor.getGivenLecture() + " dersini verdi.");
	}
}
