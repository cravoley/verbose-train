package hellogroovy;

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by cravo on 13/09/2016.
 */
@RestController
class HelloGroovyController {

    @RequestMapping("/groovy")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/groovy2")
    public String index2() {
        return "Greetings from Spring Boot222!";
    }
}
