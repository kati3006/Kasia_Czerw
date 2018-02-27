package com.kodilla.sudoku.game.resolve;

import java.util.ArrayList;
import java.util.List;

public class ResolveRow {
    private List<List<Integer>> values = new ArrayList<>();

    public ResolveRow() {
        for(int n=0; n<9; n++) {
            List<Integer> temp = new ArrayList<>();
            for (int k=1; k<=9; k++) {
                temp.add(k);
            }
            values.add(temp);
        }
    }

    public List<List<Integer>> getValues() {
        return values;
    }
}
