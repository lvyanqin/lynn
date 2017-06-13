/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/model")
public class Model {
    
    @RequestMapping(value = "/A.do")
    public ModelAndView A(String type){
        ModelAndView mv = new ModelAndView();
        System.out.println("com.lynn.controller.Model.A()");
        if(StringUtils.isNotBlank(type)){
            mv.setViewName("redirect:/model/B1.do");
            return mv;
        }
        mv.setViewName("redirect:/model/B.do");
        return mv;
    }
    
    @RequestMapping(value = "/B1.do")
    public String B1(){
        System.out.println("com.lynn.controller.Model.B1()");
        return "redirect:/model/C.do";
    }
    
    @RequestMapping(value = "/B.do")
    public ModelAndView B(){
        ModelAndView mv = new ModelAndView();
        System.out.println("com.lynn.controller.Model.B()");
        mv.setViewName("redirect:/model/C.do");
        return mv;
    }
    
    @RequestMapping(value = "/C.do")
    public ModelAndView C(){
        ModelAndView mv = new ModelAndView();
        System.out.println("com.lynn.controller.Model.C()");
        mv.setViewName("login_success");
        return mv;
    }
    
    
}
