
package upeu.edu.com.ecommerce_v2.infraestructura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import upeu.edu.com.ecommerce_v2.app.service.ProductService;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.ProductEntity;
import upeu.edu.com.ecommerce_v2.infraestructura.entity.UserEntity;


@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ProductService productService;

    public AdminController(ProductService productService) {
        this.productService = productService;
    }
    
    
    @GetMapping
    public String home(Model model){
        
        Iterable<ProductEntity> products = productService.getProducts();
        model.addAttribute("products", products);
        return "admin/home";
    }
    
}
