/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.dao.impl;

import com.lynn.bean.UserBean;
import com.lynn.dao.BaseDao;
import com.lynn.dao.UserDaoI;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class UserDao extends BaseDao<UserBean, Integer> implements UserDaoI{
    
    @Override
    public UserBean getById(Integer id) {
        String hql = "from User where id = ?";
        List<UserBean> list = getListByHQL(hql, id);
        if (list != null) {
                return list.get(0);
        } else {
                return null;
        }
    }

    @Override
    public UserBean getByName(String name) {
        String hql = "from User where username = ?";
        List<UserBean> list = getListByHQL(hql, name);
        if (list != null) {
                return list.get(0);
        } else {
                return null;
        }
    }
    
}
