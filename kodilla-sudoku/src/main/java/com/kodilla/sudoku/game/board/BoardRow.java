package com.kodilla.sudoku.game.board;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Integer> cols = new ArrayList<>();

    public BoardRow() {
        for(int n = 0; n < 9; n++) {
            cols.add(Board.EMPTY);
        }
    }

    public void setCol(int column, int value) {
        cols.add(column, value);
        cols.remove(column +1);
    }

    public int getCol(int column) {
        return cols.get(column);
    }
}