package danielcrud.springboot_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import danielcrud.springboot_crud.entity.Product;
import danielcrud.springboot_crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;
    
    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        
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
