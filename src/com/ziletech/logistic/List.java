package com.ziletech.logistic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nagendra
 */
public class List {

    public static void main(String argu) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        for (int c : list) {
            System.out.println(c);
        }

    }
}
