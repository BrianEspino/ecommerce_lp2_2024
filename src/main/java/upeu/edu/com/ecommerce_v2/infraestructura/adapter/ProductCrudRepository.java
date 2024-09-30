    
package upeu.edu.com.ecommerce_v2.infraestructura.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;


public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity> findByUserEntity(UserEntity userEntity);
}
