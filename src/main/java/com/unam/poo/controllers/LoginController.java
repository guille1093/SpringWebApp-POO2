package com.unam.poo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired PanelUsrController panelUsrController;
    @GetMapping("/login")
    public String loginload() {
        return "login";
    }

    public String loginredirect () {return panelUsrController.panelUsr();}
}