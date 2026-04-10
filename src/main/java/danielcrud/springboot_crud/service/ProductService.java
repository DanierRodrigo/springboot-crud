package danielcrud.springboot_crud.service;

import java.util.List;
import java.util.Optional;

import danielcrud.springboot_crud.entity.Product;

public interface ProductService {
    
    List<Product> findAll();
    Optional<Product> findById(Long id);

    Product save(Product product);

    void delete(Product product);
}
