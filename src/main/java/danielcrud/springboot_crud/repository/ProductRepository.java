package danielcrud.springboot_crud.repository;

import org.springframework.data.repository.CrudRepository;

import danielcrud.springboot_crud.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
