package Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/axl/api")	//acorta las urls o uris
public class HelloWorldController {

	private static Track = "Hola, %s, estas ejecutando un proyecto en gradle";
	
        @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "name", defaultValue = "Unknow") String nom) {
        return String.format(Track, name);
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(name = "name", required = false) String nom) {
        String nameReturn = Objects.requireNonNullElse(nom, "UNKNOWN");
        return String.format(Track, nameReturn);
    }
	
}
