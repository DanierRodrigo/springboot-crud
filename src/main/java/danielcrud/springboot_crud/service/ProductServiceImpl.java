package danielcrud.springboot_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import danielcrud.springboot_crud.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
