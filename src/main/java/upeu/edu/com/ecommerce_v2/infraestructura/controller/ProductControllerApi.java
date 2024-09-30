package upeu.edu.com.ecommerce_v2.infraestructura.controller;

import org.slf4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import upeu.edu.com.ecommerce_v2.app.service.ProductService;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;

@CrossOrigin(origins = "http:://4200")
@RestController
@RequestMapping("api") //localhost:8080/
public class ProductControllerApi {

    private final ProductService productService;
    private final Logger log = LoggerFactory.getLogger(ProductControllerApi.class);

    public ProductControllerApi(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/show")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ProductEntity> showProduct(Model model) {
        UserEntity userEntity = new UserEntity();
      userEntity.setId(1);
      return productService.getProductsByUser(userEntity);
    }
}
