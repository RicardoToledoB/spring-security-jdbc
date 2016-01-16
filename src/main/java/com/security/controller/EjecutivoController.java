package com.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller("ejecutivoController")
public class EjecutivoController {
     @RequestMapping("/ejecutivo/ejecutive01")
    public ModelAndView ejecutive01(){
        ModelAndView mav=new ModelAndView("/ejecutivo/ejecutive01");
        return mav;
    }
     @RequestMapping("/ejecutivo/ejecutive02")
    public ModelAndView ejecutive02(){
        ModelAndView mav=new ModelAndView("/ejecutivo/ejecutive02");
        return mav;
    }
    @RequestMapping("/ejecutivo/ejecutive03")
    public ModelAndView ejecutive03(){
        ModelAndView mav=new ModelAndView("/ejecutivo/ejecutive03");
        return mav;
    }
}
