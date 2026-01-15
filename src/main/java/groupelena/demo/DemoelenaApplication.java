package groupelena.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoelenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoelenaApplication.class, args);
	}

}
@TestController
	class HelloWorldController {
		@GetMapping ("/")
		public String sayHello () {
			return "Hello,World!";
		}
	}
