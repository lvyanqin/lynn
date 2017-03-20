
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TryTest {
    
    @Test
    public void init(){}

//    @Test
    public void tryTest() {
        try{
            method("3");
            method("a");
        }catch(Exception e){
            System.out.println("【】test");
        }
    }
    
    public void method(String param){
        Integer a = Integer.parseInt(param);
        System.out.println("【】method");
    }

}
