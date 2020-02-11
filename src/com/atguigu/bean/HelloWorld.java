package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tzc
 * @create 2020-02-11 19:07
 */
public class HelloWorld {
    private static final int i = 1;
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
