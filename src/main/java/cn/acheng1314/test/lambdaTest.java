package cn.acheng1314.test;

import java.util.Arrays;

/**
 * Created by zqchen on 16/12/14.
 */
public class lambdaTest {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();

        new Thread(()-> System.out.println("hello lambda")).start();
    }
}
