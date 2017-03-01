/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        return host + ":" + host2;//不区分大小写
    }
    
    @RequestMapping("/header1.do")
    @ResponseBody
    public String header1(HttpServletRequest request, HttpServletResponse response){
        Enumeration e = request.getHeaderNames();
        String query = request.getQueryString();//只获取get后的参数
        String etag = request.getHeader("etag");
        String if_none_match = request.getHeader("If-None-Match");
        String host = request.getHeader("host");
        String accept = request.getHeader("accept");
        String referer = request.getHeader("referer");
        String host1 = response.getHeader("host");
        String etag1 = response.getHeader("etag");
        String date1 = response.getHeader("date");
        String server1 = response.getHeader("server");
        return query;
    }
    
}
