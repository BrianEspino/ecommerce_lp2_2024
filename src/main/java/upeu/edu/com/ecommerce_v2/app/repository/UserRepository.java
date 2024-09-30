
package upeu.edu.com.ecommerce_v2.app.repository;

import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;


public interface UserRepository {
    
    public UserEntity createUser(UserEntity userEntity);
    
    public UserEntity findByEmail(String email);
    
    public UserEntity findById(Integer id);
    
    
}
