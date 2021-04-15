package tictactoe;
import java.util.*;
public class Main {
    public static void printGrid(char[][] field) {
        System.out.println("---------");
        System.out.printf("| %s %s %s |%n", field[0][0], field[0][1], field[0][2]);
        System.out.printf("| %s %s %s |%n", field[1][0], field[1][1], field[1][2]);
        System.out.printf("| %s %s %s |%n", field[2][0], field[2][1], field[2][2]);
        System.out.println("---------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] field = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                field[i][j] = ' ';
            }
        }
        int cellX = scanner.nextInt();
        int cellY = scanner.nextInt();
        char one = field[0][0];
        char two = field[0][1];
        char three = field[0][2];
        char four = field[1][0];
        char five = field[1][1];
        char six = field[1][2];
        char seven = field[2][0];
        char eight = field[2][1];
        char nine = field[2][2];

        int xCounter = 0;
        int oCounter = 0;
        boolean xwins = false;
        boolean owins = false;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == 'X') {
                    xCounter++;
                }
                if (field[i][j] == 'O') {
                    oCounter++;
                }
            }
        }


        printGrid(field);
        System.out.printf("Enter the coordinates: %d %d%n", cellX, cellY);
        while (cellX < 1 || cellX > 3 || cellY < 1 || cellY > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            cellX = scanner.nextInt();
            cellY = scanner.nextInt();
        }
        while (field[cellX - 1][cellY - 1] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            cellX = scanner.nextInt();
            cellY = scanner.nextInt();
        }
        field[cellX - 1][cellY - 1] = 'X';
        printGrid(field);
        if (Math.abs(xCounter - oCounter) >= 2) {
            System.out.println("Impossible");
        }
        if (one + two + three == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (four + five + six == ('X' + 'X' + 'X')) {
            xwins = true;
        }
        if (seven + eight + nine == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (one + two + three == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (four + five + six == ('O' + 'O' + 'O')) {
            owins = true;
        }
        if (seven + eight + nine == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (one + five + nine == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (three + five + seven == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (one + five + nine == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (three + five + seven == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (one + four + seven == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (two + five + eight == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (three + six + nine == ('X'+ 'X' + 'X')) {
            xwins = true;
        }
        if (one + four + seven == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (two + five + eight == ('O'+ 'O' + 'O')) {
            owins = true;
        }
        if (three + six + nine == ('O'+ 'O' + 'O')) {
            owins = true;
        }       
        if (xwins == true && owins == true) {
            System.out.println("Impossible");
        }
        if (xwins == true && owins == false) {
            System.out.println("X wins");
        }
        if (xwins == false && owins == true) {
            System.out.println("O wins");
        }
    }
}
