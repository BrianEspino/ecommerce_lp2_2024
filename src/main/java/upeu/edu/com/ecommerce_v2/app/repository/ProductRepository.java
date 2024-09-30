
package upeu.edu.com.ecommerce_v2.app.repository;

import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

public interface ProductRepository {
    Iterable<ProductEntity> getProducts();
    Iterable<ProductEntity> getProductsByUser(UserEntity userEntity);
    ProductEntity getProductById(Integer id);
    ProductEntity saveProducts(ProductEntity productEntity);
    boolean deleteProductById(Integer id);
}
