/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.dao;

import com.lynn.bean.UserBean;

/**
 *
 * @author Administrator
 */
public interface UserDaoI {
    
    UserBean getById(Integer id);
    
    UserBean getByName(String name);
    
}
