package riccardogulin.u5d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
//@AllArgsConstructor
@ToString
@Component
public class Interviewer {
	private IStudent student; // Questa è una DEPENDENCY
	private String name;
	private String surname;

	@Autowired
	public Interviewer(IStudent student, @Qualifier("getName") String name, @Qualifier("getSurname") String surname) {
		this.student = student;
		this.name = name;
		this.surname = surname;
	}


	public Interviewer(IStudent s) {
		this.student = s;
	}

	public void askQuestion() {
		log.warn("Hey " + student.getName() + " please solve this challenge!");
		student.answersQuestion();
	}


}
