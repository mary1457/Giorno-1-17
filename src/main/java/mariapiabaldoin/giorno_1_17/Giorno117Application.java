package mariapiabaldoin.giorno_1_17;

import lombok.extern.slf4j.Slf4j;
import mariapiabaldoin.giorno_1_17.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class Giorno117Application {

    public static void main(String[] args) {
        SpringApplication.run(Giorno117Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Giorno117Application.class);

        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();
        ctx.close();
    }

}
