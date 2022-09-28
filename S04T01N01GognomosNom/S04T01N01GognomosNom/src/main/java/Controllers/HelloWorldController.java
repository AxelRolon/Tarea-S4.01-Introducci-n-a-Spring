
package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld") //ahorra las urls largas
public class HelloWorldController {
    
    @GetMapping("/HelloWorld")//@RequesParam representa un valor que se envia a un request
    public String saluda(@RequestParam(value = "name", defaultValue="!Unknown!")String name){
        
        return "Hola," + name + "Estás ejecutando un proyecto Maven.";
    }
    
    @GetMapping(value = {"/HelloWorld2 ","/HelloWorld2{name}"})//
    public String saluda2(@PathVariable(required = false)String name){
        return "Hola, " + name +". Estás ejecutando un proyecto en maven";
    }
    
}
