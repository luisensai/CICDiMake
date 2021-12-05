package Myexample.MyWebService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class GreetingsController {
	
	@GetMapping("/hello")
	public  String greetings(
		@RequestParam(
				value = "n",
				defaultValue ="iMake"
		)
		String name
	) {
		return String.format ("Hello, %s!", name);
	}
}
