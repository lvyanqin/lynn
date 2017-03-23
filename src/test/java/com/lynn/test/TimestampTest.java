/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.test;

import java.sql.Timestamp;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TimestampTest {
    
    @Test
    public void init(){}
    
    @Test
    public void timestamp(){
        System.out.println("【】System.currentTimeMillis()：" + System.currentTimeMillis());
        Timestamp time = new Timestamp(System.currentTimeMillis());
        System.out.println("【】new Timestamp(System.currentTimeMillis())：" + time);
        boolean result = time.before(new Timestamp(2017, 3, 24, 14, 40, 0, 0));
        System.out.println("【】result：" + result);
    }
    
}
