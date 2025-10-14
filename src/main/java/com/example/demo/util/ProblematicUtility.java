package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

public class ProblematicUtility {

    private static List globalList = new ArrayList();

    public static void add(Object value) {
        globalList.add(value);
        if (globalList.size() > 1000) {
            System.gc();
        }
    }

    public static Object getLast() {
        if (globalList.size() == 0) {
            return null;
        }
        return globalList.get(globalList.size() - 1);
    }
}
