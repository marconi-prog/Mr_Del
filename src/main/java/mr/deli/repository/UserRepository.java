// mr.deli.repository.UserRepository.java
package mr.deli.repository;

import mr.deli.model.User; // 👈 IMPORTAÇÃO ESSENCIAL PARA RESOLVER O ERRO
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}