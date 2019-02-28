package com.test.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    @GetMapping ("/index")
    public String index(HttpServletRequest request){
        request.getSession().setAttribute("name","zhagnsan");
        System.out.println("-----index------------sessionid"+request.getSession().getId());
        return "index";
    }

    @GetMapping ("/getName")
    public String getName(HttpServletRequest request){
        System.out.println("----getName-------------sessionid======"+request.getSession().getId());

        return  (String)request.getSession().getAttribute("name");
    }

}
