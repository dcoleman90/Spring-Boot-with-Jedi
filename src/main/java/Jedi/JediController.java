package Jedi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JediController {

	
	@RequestMapping("/Jedi")
	public String sayHi() {
		return "General Kenobi you are a bold one";
	}
}
