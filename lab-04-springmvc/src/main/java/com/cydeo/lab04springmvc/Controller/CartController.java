package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
public class CartController {
         private CartService cartService;
    @RequestMapping("cart-list")
    public String cartInfo( Model model){
        model.addAttribute("cartList",cartService.retrieveCartList());
        model.addAttribute("cart",cartService.retrieveCartList() );
        return "/cart/cart-list";
    }
    /*
      <tr th:each="cart: ${cartList}">
            <td th:text="${cart.getId()}"></td>
            <td th:text="${cart.getCartTotalAmount()}"></td>
            ********************************
             @RequestMapping("search-product/{product2}")
    public String productInfo(@PathVariable String product2, Model model){

        System.out.println(product2);

        model.addAttribute("product", productService.searchProduct(product2));

        return "product/product-list";
     */

    @RequestMapping("cart-list/{number}")
    public String cartInfo2(@PathVariable UUID number , Model model){
        model.addAttribute("cartList",cartService.retrieveCartDetail(number)  );
        model.addAttribute("cart",cartService.retrieveCartDetail(number));
        return "cart/cart-detail";
    }
}
/*
"search-product/{product2}")
  public String productInfo(@PathVariable String product2, Model model){
        System.out.println(product2);
        model.addAttribute("product", productService.searchProduct(product2));
  <tr th:each="cart: ${cartList}">
            <td th:text="${cart.getId()}"></td>
            <td th:text="${cart.getCartTotalAmount()}"></td>
 */