/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class sortTest {
    
    @Test
    public void init(){}
    
    @Test
    public void sort(){
        List<Map> list = new ArrayList<>();
        Integer[] values = new Integer[]{2,2,1,3,2,4,6,5};
        for(int i = 0; i < values.length; i ++){
            Map map = new HashMap();
            map.put("name", "name" + i);
            map.put("value", values[i]);
            list.add(map);
        }
        List<Map> newList = new ArrayList<>(list.size());
        for(int i = 0; i < list.size() ; i ++){
            Integer tempValue_i = Integer.parseInt(list.get(i).get("value").toString());
            int k = 0, m = 0;
            for(int j = 0; j < list.size(); j ++){
                Integer tempValue_j = Integer.parseInt(list.get(j).get("value").toString());
                if(tempValue_i < tempValue_j ){
                    k ++;
                }else if(tempValue_i == tempValue_j && i != j){
                    if(i > j){
                        m ++;
                    }
                }
            }
            list.get(i).put("sortRank", (k + 1) + m);
        }
        System.out.println("com.lynn.test.sortTest.sort()");
    }
    
}
