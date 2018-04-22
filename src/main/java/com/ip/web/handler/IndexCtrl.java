package com.ip.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.Arrays;
import java.util.List;

@Controller
public class IndexCtrl {

    private static final List<String> WapSet = Arrays.asList("iPhone", "iPod", "Android", "ios", "iPad"); //iPhone|iPod|Android|ios|iPad

    @GetMapping(value = {"", "index.html"})
    public String index(@RequestHeader("User-Agent") String agent) {
        boolean isWap = false;
        for (String keyWord : WapSet) {
            if (agent.contains(keyWord)) {
                isWap = true;
                break;
            }
        }
        if (isWap) {
            return "wap_home";
        }
        return "pc_home";
//        if (isWap) {
//            return new RedirectView("/static/wap_home.html");
//        }
//        return new RedirectView("/static/pc_home.html");
    }
}
