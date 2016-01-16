package com.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("administradorController")
public class AdministradorController {
    @RequestMapping("/administrador/admin01")
    public ModelAndView admin01(){
        ModelAndView mav=new ModelAndView("/administrador/admin01");
        return mav;
    }
     @RequestMapping("/administrador/admin02")
    public ModelAndView admin02(){
        ModelAndView mav=new ModelAndView("/administrador/admin02");
        return mav;
    }
    @RequestMapping("/administrador/admin03")
    public ModelAndView admin03(){
        ModelAndView mav=new ModelAndView("/administrador/admin03");
        return mav;
    }
}
