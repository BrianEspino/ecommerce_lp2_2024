package upeu.edu.com.ecommerce_v2.infraestructura.adapter;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import upeu.edu.com.ecommerce_v2.app.repository.UserRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserCrudRepository userCrudRepository;

    public UserRepositoryImpl(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userCrudRepository.save(userEntity);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userCrudRepository.findByEmail(email).get();
    }

    @Override
    public UserEntity findById(Integer id) {
        return userCrudRepository.findById(id).get();

    }

}
