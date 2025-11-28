// mr.deli.DeliApplication.java

package mr.deli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity // ANOTAÇÃO HABILITA O @PreAuthorize
public class DeliApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliApplication.class, args);
    }

}