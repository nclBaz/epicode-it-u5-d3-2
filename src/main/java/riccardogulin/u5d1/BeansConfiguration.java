package riccardogulin.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration // è una delle maniere per dichiarare i nostri Beans (cioè gli oggetti gestiti
				// da Spring)
public class BeansConfiguration {

	@Bean // Obbligatorio usarlo, altrimenti non verrà gestito da Spring
	String getName() {
		return "Giacomo";
	}

	@Bean // Obbligatorio usarlo, altrimenti non verrà gestito da Spring
	String getSurname() {
		return "Poretti";
	}

	@Bean
	int getAge() {
		return 30;
	}

	@Bean
	@Scope("prototype")
	FrontendStudent getFe() {
		return new FrontendStudent("Aldo");
	}

	@Bean
	@Primary
	BackendStudent getBe() {
		return new BackendStudent(getName()); // Posso anche richiamare altri Bean da un Bean
	}

//	@Bean(name = "getInterviewer")
//	Interviewer interviewer(IStudent s) {
//		return new Interviewer(s);
//	}
}
