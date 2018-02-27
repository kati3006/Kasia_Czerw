package com.kodilla.sudoku.game.board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final Integer EMPTY = -1;
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for(int n = 0 ; n < 9; n++) {
            rows.add(new BoardRow());
        }
    }

    public void setValue(int row, int column, int value) {
        rows.get(row).setCol(column, value);
    }

    public int getValue(int row, int column) {
        return rows.get(row).getCol(column);
    }

    @Override
    public String toString () {
        String s = "===================\n";
        for (int x = 0; x <9; x++) {
            s += "|";
            for (int y = 0; y < 9; y++) {
                int v = getValue(x,y);
                if (v != EMPTY) {
                    s += v + "|";
                } else {
                    s += " |";
                }
            }
            if (x < 8) {
                s += "\n-------------------\n";
            } else {
                s += "\n===================\n";
            }
        }
        return s;
    }
}
