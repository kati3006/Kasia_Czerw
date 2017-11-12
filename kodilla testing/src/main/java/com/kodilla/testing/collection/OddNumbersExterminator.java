package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();
        int value = 0;
        for (int n = 0; n < numbers.size(); n++) {
            value = numbers.get(n);
            if (value % 2 == 0) {
                resultList.add(value);
            }
        }
        return resultList;
    }
}
