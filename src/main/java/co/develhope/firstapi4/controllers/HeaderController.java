package co.develhope.firstapi4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping
    public String getHeaders(){
        return request.getServerName() + " " +request.getServerPort();
    }
}
