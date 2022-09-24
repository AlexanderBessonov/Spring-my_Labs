package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.service.ProductService;
import com.cydeo.lab04springmvc.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("search-product/{product2}")
    public String productInfo(@PathVariable("product2") String product2, Model model){

        System.out.println(product2);
        model.addAttribute("productList",productService.searchProduct(product2));


        return "product/product-list";
    }
}
/*
   @RequestMapping("/info/{make}/{year}")//localhost:8080/info/honda
    public String getCarInfo(@PathVariable String make, @PathVariable String year){// different is ok //by position

        System.out.println(make);
        System.out.println(year);

          return "car/car-info";

           <tr th:each="product : ${productList}">
            <td th:text="${product.getId()}"></td>
            <td th:text="${product.getName()}"></td>
            <td th:text="${product.getPrice()}"></td>
            <td th:text="${product.getRemainingQuantity()}"></td>
        </tr>
    }
 */