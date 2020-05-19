package jie.a.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("hhhh");
    }


}
