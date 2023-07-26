package riccardogulin.u5d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Slf4j
public class FrontendStudent implements IStudent {
	private String name;

	@Override
	public void answersQuestion() {
		log.info("I'm the Frontend Student..This is the answer bla bla bla...");
	}

}