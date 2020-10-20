package cn.zysheep.springboot.controller;

import cn.zysheep.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ProjectName: springboot-learning-examples
 * @ClassName: MainController
 * @Author: YangYanShu
 */
@Controller
public class MainController {

    @RequestMapping(value = {"/","thymeleaf/index"},method = RequestMethod.GET)
    public String index(Model model){
        User user = new User();
        user.setUsername("YangYanShu");
        user.setAge(20);
        model.addAttribute("user",user);

        return "index";
    }
}

