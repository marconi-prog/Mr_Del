// mr.deli.service.ProductService.java
package mr.deli.service;

import mr.deli.model.Product;
import mr.deli.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllAvailableProducts() {
        return productRepository.findByAvailableTrue();
    }


    public List<Product> findAll() {
        return productRepository.findAll();
    }
}