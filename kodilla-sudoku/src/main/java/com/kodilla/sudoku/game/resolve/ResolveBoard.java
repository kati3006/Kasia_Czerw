package com.kodilla.sudoku.game.resolve;

import java.util.ArrayList;
import java.util.List;

public class ResolveBoard {
    private List<ResolveRow> rows = new ArrayList<>();

    public ResolveBoard() {
        for (int n=0; n<9;n++) {
            rows.add(new ResolveRow());
        }
    }

    public List<ResolveRow> getRows() {
        return rows;
    }
}
