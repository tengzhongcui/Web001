package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tzc
 * @create 2020-02-11 18:27
 */
public class HelloTest {
    public static final int x = 1;
    public static final int a = 2;





    public static void main(String[] args) {
        List arrayList = null;
        try {
            List list = new ArrayList();
            arrayList = new ArrayList();
            arrayList.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Object o : arrayList) {
            
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }





    }
}
