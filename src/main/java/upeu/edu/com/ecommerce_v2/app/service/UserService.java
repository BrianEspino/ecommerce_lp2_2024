
package upeu.edu.com.ecommerce_v2.app.service;

import upeu.edu.com.ecommerce_v2.app.repository.UserRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
        
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.createUser(userEntity);
    }
            
    
    public UserEntity findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    
    public UserEntity findById(Integer id){
        return userRepository.findById(id);
    }
    
    
    
}
