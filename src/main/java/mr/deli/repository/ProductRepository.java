// mr.deli.repository.ProductRepository.java
package mr.deli.repository;

import mr.deli.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByAvailableTrue();
}