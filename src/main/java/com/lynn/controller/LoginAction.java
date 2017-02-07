/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

<<<<<<< HEAD
import com.lynn.bean.ResultBean;
import com.lynn.bean.UserBean;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
=======
import com.lynn.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 3e07327f6ff0752830ddb413e4d78784ba6eb70d
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class LoginAction {
    
   
    @RequestMapping(value = "/login.do", method = RequestMethod.POST,  produces = "text/html;charset=UTF-8" )
<<<<<<< HEAD
    @ResponseBody
    public String loginAction(HttpServletRequest request, UserBean user) throws IOException{
        System.out.println("【】" + user);
        String username = user.getUsername();
        String password = user.getPassword();
        ResultBean result = null;
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            result = new ResultBean("error", "用户名或密码不能为空!");
            
        }else if(!"lynn".equalsIgnoreCase(username) || !"123456".equals(password)){
            result = new ResultBean("error", "用户名或密码不对!");
        }else{
            result = new ResultBean("ok", "1");
            request.getSession().setAttribute("user", user);
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
=======
    public ModelAndView login_post(UserBean user){
        System.out.println("【】" + user);
        ModelAndView mv = new ModelAndView();
>>>>>>> 3e07327f6ff0752830ddb413e4d78784ba6eb70d
        mv.setViewName("login_success");
        return mv;
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 3e07327f6ff0752830ddb413e4d78784ba6eb70d
}
