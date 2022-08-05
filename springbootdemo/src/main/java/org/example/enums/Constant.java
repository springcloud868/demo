package org.example.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/1/27
 */
public class Constant {
    /**
     * 权限管理
     */
    public static Map<Integer,String[]> permission=new HashMap<>();
    static {
        //用户1所拥有的URL权限
        String[] frist={"/url1","/url2","/url3","/url4","/url5","/url6","/url7"};
        //用户2所拥有的URL权限
        String[] second={"/url1","/url2","/url3","/url4","/url5"};
        //用户3所拥有的URL权限
        String[] third={"/url1","/url2","/url3"};
        permission.put(1,frist);
        permission.put(2,second);
        permission.put(3,third);

    }
}