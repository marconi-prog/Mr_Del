// mr.deli.DataInitializer.java
package mr.deli;

import mr.deli.enums.Role;
import mr.deli.model.Product;
import mr.deli.model.User;
import mr.deli.repository.ProductRepository;
import mr.deli.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ProductRepository productRepository;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (userRepository.findByEmail("admin@deli.com").isEmpty()) {

            User admin = new User(
                    null,
                    "Admin Master",
                    "admin@deli.com",
                    passwordEncoder.encode("123mudar"),
                    Role.ADMIN
            );
            userRepository.save(admin);
            System.out.println(">>> Usuário ADMIN criado: admin@deli.com");
        }

        if (productRepository.count() == 0) {

            List<Product> initialProducts = List.of(
                    new Product(null, "Pizza Pepperoni", "Clássica com queijo e pepperoni.", new BigDecimal("55.00"), null, true),
                    new Product(null, "Refrigerante Cola", "Lata 350ml.", new BigDecimal("7.50"), null, true),
                    new Product(null, "Suco Natural Laranja", "Copo 300ml.", new BigDecimal("12.00"), null, false)
            );

            productRepository.saveAll(initialProducts);
            System.out.println(">>> " + initialProducts.size() + " Produtos iniciais criados.");
        }
    }
}