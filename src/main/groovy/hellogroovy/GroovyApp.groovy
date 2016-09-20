package hellogroovy;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan

/**
 * Created by cravo on 13/09/2016.
 */

@SpringBootApplication
@ComponentScan(["hello", "hellogroovy"])
class GroovyApp {

    static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(GroovyApp.class, args);
//
//        System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
    }
}
