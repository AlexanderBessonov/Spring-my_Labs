package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
public class CartController {
         private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("cart-list")
    public String cartInfo( Model model){
        model.addAttribute("cartList",cartService.retrieveCartList());
        return "/cart/cart-list";
    }


    @RequestMapping("cart-list/{number}")
    public String cartInfo2(@PathVariable UUID number , Model model){
        model.addAttribute("cart",cartService.retrieveCartDetail(number));
        return "cart/cart-detail";
    }
}
