package cn.acheng1314.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zqchen on 16/12/9.
 */
public class StrTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("wellcome");
        list.add("china");
        for (int i=0 ;i<list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

    }
}
