package upeu.edu.com.ecommerce_v2.infraestructura.adapter;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

public interface UserCrudRepository extends CrudRepository<UserEntity, Integer> {

    public Optional<UserEntity> findByEmail(String email);
    
}
