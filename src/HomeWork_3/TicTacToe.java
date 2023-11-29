package HomeWork_3;

import java.util.Scanner;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        fillBoard();
    }

    public void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    private void changeOfPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private boolean isFinishGame() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }

        }
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }

        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    private boolean isCorrectMove(int row, int collumn) {
        if (board[row][collumn] != '-')
            return false;
        else return true;
    }

    public void play() {
        printBoard();
        while (true) {

            System.out.println("Ходит игрок " + currentPlayer);
            System.out.println("Введите номер строки (0,1,2) ");
            int row = new Scanner(System.in).nextInt();
            System.out.println("Введите номер столбца (0,1,2) ");
            int collumn = new Scanner(System.in).nextInt();

            if (isCorrectMove(row, collumn)) {
                board[row][collumn] = currentPlayer;

                if (isFinishGame()) {
                    System.out.println("Победил игрок: " + currentPlayer);
                    break;
                } else if (isBoardFull()) {
                    System.out.println("Ничья: ");
                    break;
                } else changeOfPlayer();

            } else {
                System.out.println("Выбирите другой ход: " + currentPlayer);
            }
            printBoard();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

