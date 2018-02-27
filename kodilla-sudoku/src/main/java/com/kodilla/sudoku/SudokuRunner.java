package com.kodilla.sudoku;

import com.kodilla.sudoku.game.SudokuGame;
public class SudokuRunner {
    public static void main(String[] args) {
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.enterUserValues();
        if (sudokuGame.resolveSudoku()) {
            System.out.println(sudokuGame.getBoard());
        }
    }

}
