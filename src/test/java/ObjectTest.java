
import java.util.Objects;
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
public class ObjectTest {
    
    @Test
    public void init(){}
    
//    @Test
    public void equals(){
        boolean a = Objects.equals("", "");
        boolean b = Objects.equals(null, null);
        boolean c = "".equals("");
        System.out.println("【1】" + a + "_" + b + "_" + c);
        String temp = null;
//        boolean d = temp.equals(null);
//        System.out.println("【2】" + d);
                
    }
    
    @Test
    public void equals1(){
        boolean a = (null == null);
        String temp1 = null;
        String temp2 = null;
        boolean b = (temp1 == temp2);
        boolean c = temp1 instanceof String;
        boolean d = null instanceof String;
        System.out.println("【】" + a + "_" + b + "_" + c + "_" + d);
    }
    
//    @Test
    public void equalsInteger(){
        Integer a = 120;
        Integer b = 120;
        boolean isResult = (a == b);
        boolean isResult1 = (1 == 1);
        boolean isResult2 = ((1 + "").equals(1));//false
        boolean isResult3 = ((1 + "").equals(1 + ""));
        boolean isResult4 = (new Integer(1).equals(1));
        System.out.println("【】" + isResult + "_" + isResult1 + "_" + isResult2 + "_" + isResult3 + "_" + isResult4);
    }
    
    
}
