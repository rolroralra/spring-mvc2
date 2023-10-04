package hello.thymeleaf;

import org.apache.catalina.connector.ResponseFacade;
import org.apache.catalina.core.ApplicationContextFacade;
import org.apache.catalina.session.StandardSessionFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafBasicApplication.class, args);
	}

}
