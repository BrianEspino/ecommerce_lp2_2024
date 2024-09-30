/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.com.ecommerce_v2.infraestructura.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.com.ecommerce_v2.app.repository.ProductRepository;
import upeu.edu.com.ecommerce_v2.app.repository.UserRepository;
import upeu.edu.com.ecommerce_v2.app.service.ProductService;
import upeu.edu.com.ecommerce_v2.app.service.UploadFile;
import upeu.edu.com.ecommerce_v2.app.service.UserService;

@Configuration
public class BeanConfig {
    
    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserService(userRepository);
    }
    
    @Bean
    public ProductService productService (ProductRepository productRepository , UploadFile uploadFile){
        return new ProductService(productRepository , uploadFile);
    }
    
    
    @Bean 
    public UploadFile uploadFile (){
    return new UploadFile ();
    }
}
