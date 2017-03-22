#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.utils.test;

import ${package}.utils.OkHttpUtil;
import org.junit.Test;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/3/13
 * <p>Version: 1.0
 */
public class OkhttpUtilsTest {

    @Test
    public void testGet(){
        System.out.println(OkHttpUtil.get("http://www.hao123.com"));
    }

    @Test
    public void testPost(){
        String url = "";
    }

}
