/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/http")
public class HttpAction {
    
    @RequestMapping("/header.do")
    @ResponseBody
    public String header(@RequestHeader("Host") String  host, @RequestHeader("host") String host2){
        return host + ":" + host2;
    }
    
    @RequestMapping("/header1.do")
    @ResponseBody
    public String header1(HttpServletRequest request){
        Enumeration e = request.getHeaderNames();
        return "";
    }
    
}
