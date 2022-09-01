package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result1 = function(Integer.parseInt(a));
        int result2 = function(Integer.parseInt(b));

        if (result1 == result2) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
        return result1 - result2;
    }

    private int function(int a) {
        return 5 * a * a + 3;
    }
}
