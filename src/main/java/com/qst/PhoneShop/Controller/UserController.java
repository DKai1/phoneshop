package com.qst.PhoneShop.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @RequestMapping("login")
    public String login(String username,String password){
        System.out.println("username"+username+"pwd"+password);
        return "manage";
    }
}
