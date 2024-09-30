package upeu.edu.com.ecommerce_v2.infraestructura.adapter;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import upeu.edu.com.ecommerce_v2.app.repository.ProductRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductCrudRepository productCrudRepository;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository) {
        this.productCrudRepository = productCrudRepository;
    }

    @Override
    public Iterable<ProductEntity> getProducts() {
        return productCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductEntity> getProductsByUser(UserEntity userEntity) {
        return productCrudRepository.findByUserEntity(userEntity);
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return productCrudRepository.findById(id).get();
    }

    @Override
    public ProductEntity saveProducts(ProductEntity productEntity) {
        return productCrudRepository.save(productEntity);
    }

    @Override
    @Transactional
    public boolean deleteProductById(Integer id) {
         productCrudRepository.deleteById(id);
         return true;
    }

}
