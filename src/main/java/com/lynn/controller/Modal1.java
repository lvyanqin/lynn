/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/modal1")
public class Modal1 {
    
    
    
    @RequestMapping("/flash.do")
    public String flash(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("username", "中文");
        redirectAttributes.addFlashAttribute("username1", "Biao");
        return "redirect:flash2.do";
    }
 
    @RequestMapping("/flash2.do")
    @ResponseBody
    public String flash2(@ModelAttribute("username") String username, @ModelAttribute("username1") String username1) {
        return "username: " + username + "username1: " + username1;
    }
    
    @RequestMapping(value="/a.do")
    public String a(RedirectAttributes attr) throws IOException{
        Map map = new HashMap();
        map.put("1", "1");
        map.put("11", "11");
        map.put("111", "111");
        attr.addFlashAttribute("s2", "中文");
        attr.addFlashAttribute("map", new ObjectMapper().writeValueAsString(map));
        return "redirect:/modal1/b.do";
    }
    
     @RequestMapping(value="/b.do")
    public ModelAndView b(@ModelAttribute("s2") String s2, @ModelAttribute("map") String map) throws IOException{
        ModelAndView mv = new ModelAndView();
        System.out.println("com.lynn.controller.Modal1.b()");
        mv.addObject("s3", s2 + "dksjaflkaj");
        if(StringUtils.isNotBlank(map)){
            mv.addObject("map", new ObjectMapper().readValue(map, Map.class));
        }
        mv.setViewName("login_success");
        return mv;
    }
    
}
