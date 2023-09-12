package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public String hello(@RequestParam(defaultValue = "UNKNOWN") String name) {
		return "Hello " + name + ". You´re executing a Maven Project.";
	}
	
	@RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
	public String hello2(@PathVariable Optional<String> name) {
		if (name.isPresent()) {
			return "Hello " + name.get() + ". You´re executing a Maven Project.";
		} else {
			return "value is optional and not present.";
		}
	}

}
