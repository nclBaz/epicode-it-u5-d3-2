package riccardogulin.u5d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
@Component // Oggetti di questa classe verranno gestiti da Spring
@Scope("prototype")
// Se non specifichiamo niente lo scope è SINGLETON
// Prototype significa che ogniqualvolta un FullstackStudent viene
// o richiesto esplicitamente tramite getBean() oppure iniettato
// da Spring come dependency di un altro Bean, verrà creata una 
// NUOVA istanza. Con il singleton invece l'istanza sarà sempre 
// la stessa
@AllArgsConstructor
@Builder
public class FullstackStudent implements IStudent {

	private String name;
	private String surname;
	private String job;
	private int age;

	@Override
	public void answersQuestion() {
		log.info("I'm the Fullstack Student..This is the answer bla bla bla...");
	}

	public FullstackStudent(@Value("Ajeje") String name) {
		super();
		this.name = name;
	}

}
