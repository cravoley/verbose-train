package hellogroovy.two

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by cravo on 13/09/2016.
 */
@RestController
class newController {

    @RequestMapping("/new")
    def String index() {
        return "Hello";
    }
}
