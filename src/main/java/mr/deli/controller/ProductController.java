// mr.deli.controller.ProductController.java
package mr.deli.controller;

import mr.deli.model.Product;
import mr.deli.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize; // Importante para autorização
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllAvailableProducts() {
        List<Product> products = productService.findAllAvailableProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/management")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> getAdminOnlyData() {
        return ResponseEntity.ok("Dados de Gerenciamento de Produtos (ADMIN APENAS)");
    }
}