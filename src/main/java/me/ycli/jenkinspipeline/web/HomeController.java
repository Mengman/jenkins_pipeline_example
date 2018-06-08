package me.ycli.jenkinspipeline.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yucai on 2018/6/8.
 * Email: lyc@maxdiag.com
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "/")
    public String homePage() {
        return "home";
    }
}
