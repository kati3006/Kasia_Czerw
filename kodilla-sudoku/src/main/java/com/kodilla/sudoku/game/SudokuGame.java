package com.kodilla.sudoku.game;

import com.kodilla.sudoku.game.board.Board;
import com.kodilla.sudoku.game.resolve.ResolveBoard;

import java.util.List;
import java.util.Scanner;

public class SudokuGame {
    public static final String QUIT = "Q";
    public static final String EXAMPLE = "E";
    private Board board = new Board();

    public Board getBoard() {
        return board;
    }

    public void enterUserValues() {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals(QUIT)) {
            System.out.println("Enter value in format XYV (X, Y - 0..8), V - value [type Q to quit, E for example]:");
            s = scanner.nextLine().toUpperCase();
            if (!s.equals(QUIT)&&!s.equals(EXAMPLE)) {
                int x = Integer.parseInt(s.substring(0,1));
                int y = Integer.parseInt(s.substring(1,2));
                int v = Integer.parseInt(s.substring(2,3));
                getBoard().setValue(x, y, v);
                System.out.println(getBoard());
            }
            if (s.equals(EXAMPLE)){
                fillExampleData();
                System.out.println(getBoard());
            }
        }
    }

    private void fillExampleData() {
        board.setValue(0,1,7);
        board.setValue(0,2,5);
        board.setValue(0,3,9);
        board.setValue(0,4,1);
        board.setValue(0,5,3);
        board.setValue(0,6,2);

        board.setValue(1,2,4);
        board.setValue(1,4,6);
        board.setValue(1,7,5);

        board.setValue(2,0,9);
        board.setValue(2,1,1);
        board.setValue(2,2,8);
        board.setValue(2,3,4);
        board.setValue(2,5,2);

        board.setValue(3,0,8);
        board.setValue(3,4,4);
        board.setValue(3,6,6);

        board.setValue(4,2,2);
        board.setValue(4,4,7);
        board.setValue(4,7,1);

        board.setValue(5,0,4);
        board.setValue(5,2,1);
        board.setValue(5,6,5);
        board.setValue(5,7,9);

        board.setValue(6,0,2);
        board.setValue(6,4,8);
        board.setValue(6,6,1);

        board.setValue(7,3,3);
        board.setValue(7,5,4);
        board.setValue(7,6,8);
        board.setValue(7,7,7);
        board.setValue(7,8,2);

        board.setValue(8,2,9);
        board.setValue(8,3,1);
        board.setValue(8,4,2);
        board.setValue(8,5,6);
        board.setValue(8,6,3);
        board.setValue(8,8,5);
    }

    private int getSquareNumber(int field){
        return ((field)/3);
    }
    private void removeValueFromField (ResolveBoard rb, int row, int col, int value) {
        int index = -1;
        for(int q=0; q<rb.getRows().get(row).getValues().get(col).size(); q++){
            if (rb.getRows().get(row).getValues().get(col).get(q)==value){
                index = q;
            }
        }
        if (index!=-1) {
            rb.getRows().get(row).getValues().get(col).remove(index);
        }
    }
    private boolean isSudokuResolved(){
        boolean result = true;
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board.getValue(row, col) == Board.EMPTY) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    public boolean resolveSudoku() {
        boolean modified = true;
        while (!isSudokuResolved()&&modified) {
            modified = false;
            ResolveBoard rb = new ResolveBoard();
            //delete from occupied fields
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (board.getValue(row, col) != Board.EMPTY) {
                        rb.getRows().get(row).getValues().get(col).clear();
                    }
                }
            }
            //delete form columns and rows
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    int value = board.getValue(row, col);
                    if (value != Board.EMPTY) {
                        for (int n = 0; n < 9; n++) {
                            removeValueFromField(rb, row, n, value);
                            removeValueFromField(rb, n, col, value);
                        }
                    }
                }
            }
            //delete from squares 3x3
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    int value = board.getValue(row, col);
                    if (value != Board.EMPTY) {
                        removeValueFromField(rb, getSquareNumber(row) * 3, getSquareNumber(col) * 3, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3, getSquareNumber(col) * 3 + 1, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3, getSquareNumber(col) * 3 + 2, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 1, getSquareNumber(col) * 3, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 1, getSquareNumber(col) * 3 + 1, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 1, getSquareNumber(col) * 3 + 2, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 2, getSquareNumber(col) * 3, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 2, getSquareNumber(col) * 3 + 1, value);
                        removeValueFromField(rb, getSquareNumber(row) * 3 + 2, getSquareNumber(col) * 3 + 2, value);
                    }
                }
            }
            //write single values to solution
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (rb.getRows().get(row).getValues().get(col).size() == 1) {
                        board.setValue(row, col, rb.getRows().get(row).getValues().get(col).get(0));
                        modified = true;
                    }
                }
            }
        }
        if (!isSudokuResolved()) {
            System.out.println("Sudoku is unresolvable!");
            return false;
        }
        return true;
    }
}

