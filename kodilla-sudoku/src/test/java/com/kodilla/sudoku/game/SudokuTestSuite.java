package com.kodilla.sudoku.game;

import org.junit.Test;

public class SudokuTestSuite {

    @Test
    public void testEasySudoku() {
        //Given
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.getBoard().setValue(0,1,7);
        sudokuGame.getBoard().setValue(0,2,5);
        sudokuGame.getBoard().setValue(0,3,9);
        sudokuGame.getBoard().setValue(0,4,1);
        sudokuGame.getBoard().setValue(0,5,3);
        sudokuGame.getBoard().setValue(0,6,2);

        sudokuGame.getBoard().setValue(1,2,4);
        sudokuGame.getBoard().setValue(1,4,6);
        sudokuGame.getBoard().setValue(1,7,5);

        sudokuGame.getBoard().setValue(2,0,9);
        sudokuGame.getBoard().setValue(2,1,1);
        sudokuGame.getBoard().setValue(2,2,8);
        sudokuGame.getBoard().setValue(2,3,4);
        sudokuGame.getBoard().setValue(2,5,2);

        sudokuGame.getBoard().setValue(3,0,8);
        sudokuGame.getBoard().setValue(3,4,4);
        sudokuGame.getBoard().setValue(3,6,6);

        sudokuGame.getBoard().setValue(4,2,2);
        sudokuGame.getBoard().setValue(4,4,7);
        sudokuGame.getBoard().setValue(4,7,1);

        sudokuGame.getBoard().setValue(5,0,4);
        sudokuGame.getBoard().setValue(5,2,1);
        sudokuGame.getBoard().setValue(5,6,5);
        sudokuGame.getBoard().setValue(5,7,9);

        sudokuGame.getBoard().setValue(6,0,2);
        sudokuGame.getBoard().setValue(6,4,8);
        sudokuGame.getBoard().setValue(6,6,1);

        sudokuGame.getBoard().setValue(7,3,3);
        sudokuGame.getBoard().setValue(7,5,4);
        sudokuGame.getBoard().setValue(7,6,8);
        sudokuGame.getBoard().setValue(7,7,7);
        sudokuGame.getBoard().setValue(7,8,2);

        sudokuGame.getBoard().setValue(8,2,9);
        sudokuGame.getBoard().setValue(8,3,1);
        sudokuGame.getBoard().setValue(8,4,2);
        sudokuGame.getBoard().setValue(8,5,6);
        sudokuGame.getBoard().setValue(8,6,3);
        sudokuGame.getBoard().setValue(8,8,5);

        System.out.println(sudokuGame.getBoard());

        //When
        sudokuGame.resolveSudoku();
        System.out.println(sudokuGame.getBoard());
    }
}

