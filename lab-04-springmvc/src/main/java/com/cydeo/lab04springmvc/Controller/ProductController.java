package com.cydeo.lab04springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("search-product/{product}")
    public String productInfo(@PathVariable String product){

        System.out.println(product);

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