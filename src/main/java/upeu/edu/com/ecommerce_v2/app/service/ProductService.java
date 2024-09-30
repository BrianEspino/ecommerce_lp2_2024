package upeu.edu.com.ecommerce_v2.app.service;

import java.io.IOException;
import java.time.LocalDateTime;
import org.springframework.web.multipart.MultipartFile;
import upeu.edu.com.ecommerce_v2.app.repository.ProductRepository;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

public class ProductService {

    private final ProductRepository productRepository;
    private final UploadFile uploadFile;

    public ProductService(ProductRepository productRepository, UploadFile uploadFile) {
        this.productRepository = productRepository;
        this.uploadFile = uploadFile;
    }

    


    public Iterable<ProductEntity> getProducts() {
       return productRepository.getProducts();
    }

    public Iterable<ProductEntity> getProductsByUser(UserEntity userEntity) {
      return productRepository.getProductsByUser(userEntity);
    }

    public ProductEntity getProductById(Integer id) {
      return productRepository.getProductById(id);
    }

    public ProductEntity saveProduct(ProductEntity productEntity , MultipartFile multipartfile)throws IOException{
        if (productEntity.getId()==null) {
            UserEntity user = new UserEntity ();
            user.setId(1);
            productEntity.setDateCreated(LocalDateTime.now());
            productEntity.setDateUpdated(LocalDateTime.now());
            productEntity.setUserEntity(user);
            productEntity.setImage (uploadFile.upload(multipartfile));  
            return productRepository.saveProducts(productEntity);
        }
        
        else {
            
            ProductEntity productDB = productRepository.getProductById(productEntity.getId());
            if (multipartfile.isEmpty()) {
               productEntity.setImage(productDB.getImage());
            }
            
            else{
                if (!productDB.getImage().equals("default.jpg")) {
                    uploadFile.delete(productDB.getImage());                   
                }
                
            productEntity.setImage (uploadFile.upload(multipartfile));  

                
            }                  
            productEntity.setCode(productDB.getCode());
            productEntity.setDateCreated(productDB.getDateCreated());
            productEntity.setDateUpdated(LocalDateTime.now());
            return productRepository.saveProducts(productEntity);


            
    }
}

    public boolean deleteProductById(Integer id) {
      return productRepository.deleteProductById(id);
    }
}
