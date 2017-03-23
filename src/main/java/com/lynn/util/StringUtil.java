/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.util;

import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Administrator
 */
public class StringUtil {
    
    /**
     * Object转Json
     * 
     * @param value
     * @return 
     */
    public static String ObjectToJson(Object value) {
        try {
            if(value==null)
                return null;
            ObjectMapper mapper = new ObjectMapper();
            String js = mapper.writeValueAsString(value);
            return js;
        } catch (Exception ex) {
            System.out.println("【异常信息】 >>> " + ex.toString());
            return "Error";
        }
    }
    
}
