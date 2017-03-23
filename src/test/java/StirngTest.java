
import java.util.HashMap;
import java.util.Map;
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
public class StirngTest {
    
    @Test
    public void init(){}
    
    @Test
    public void objectToJson(){
        Map map = new HashMap();
        map.put("name", "qq");
        map.put("sex", "12");
        String json = com.lynn.util.StringUtil.ObjectToJson(map);
        System.out.println("【lynn】成功" + json);
    }
    
    @Test
    public void jarTest(){
        Map map = new HashMap();
        map.put("name", "qq");
        map.put("sex", "12");
        String json = com.zilin.util.StringUtil.ObjectToJson(map);
        System.out.println("【zilin】成功" + json);
    }
    
}
