/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import com.lynn.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class LoginAction {
    
   
    @RequestMapping(value = "/login.do", method = RequestMethod.POST,  produces = "text/html;charset=UTF-8" )
    public ModelAndView login_post(UserBean user){
        System.out.println("【】" + user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login_success");
        return mv;
    }
    
}
