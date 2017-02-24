/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;


import com.lynn.bean.ResultBean;
import com.lynn.bean.UserBean;
import com.lynn.dao.UserDaoI;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class LoginAction {
    
    @Autowired
    private UserDaoI userDaoI;
   
    @RequestMapping(value = "/login.do", method = RequestMethod.POST,  produces = "text/html;charset=UTF-8" )
    @ResponseBody
    public String loginAction(HttpServletRequest request, UserBean user) throws IOException{
        System.out.println("����" + user);
        String username = user.getUsername();
        String password = user.getPassword();
        ResultBean result = null;
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            result = new ResultBean("error", "用户名和密码不能为空");
            return new ObjectMapper().writeValueAsString(result);
        }
        UserBean tempUser = userDaoI.getByName(username);
        if(tempUser != null){
            if(!username.equalsIgnoreCase(tempUser.getUsername()) || !password.equalsIgnoreCase(tempUser.getPassword())){
            result = new ResultBean("error", "用户名或密码不正确!");
            }else{
                result = new ResultBean("ok", "1");
                request.getSession().setAttribute("user", user);
            }
        }
        return new ObjectMapper().writeValueAsString(result);
    }
    
    @RequestMapping("/login/success.do")
    public ModelAndView loginSuccess(HttpServletRequest request){
        UserBean user = (UserBean) request.getSession().getAttribute("user");
        ModelAndView mv = new ModelAndView();
        if(user == null){
            mv.setViewName("redirect:/login.jsp");
            return mv;
        }
        mv.addObject("username", user.getUsername());
        mv.setViewName("login_success");
        return mv;
    }
}
