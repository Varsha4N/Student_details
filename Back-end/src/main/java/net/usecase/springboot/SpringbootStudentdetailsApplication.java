package net.usecase.springboot;

import net.usecase.springboot.model.Student;
import net.usecase.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  SpringbootStudentdetailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentdetailsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

/*		Student student = new Student();
		student.setFirstName("Callie");
		student.setLastName("Foster");
		student.setEmailID("calliefoster@gmail.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setFirstName("Lina");
		student1.setLastName("Blackford");
		student1.setEmailID("lineblackford@gmail.com");
		studentRepository.save(student1);

*/
	}
}
