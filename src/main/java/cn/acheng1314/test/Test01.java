package cn.acheng1314.test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 * Created by zqchen on 16/12/16.
 */
public class Test01 {
    public static void main(String[] args) {
        int i = 1;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMaximumIntegerDigits(4);
        numberFormat.setMinimumIntegerDigits(4);
        System.out.println(numberFormat.format(i));
    }
}
