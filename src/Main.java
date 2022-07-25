import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {

    static char[][] inputs = new char[3][3];
    static int xCounter = 0;
    static int oCounter = 0;
    static boolean isFinished = false;
    static String xInput;
    static String yInput;
    static boolean xTurn = false;
    static boolean oTurn = false;
    static boolean xWins;
    static boolean oWins;

    public static void main(String[] args) {
        displayGameBoard();
        enterInput();

    }

    public static void displayGameBoard(){
        System.out.println("---------");
        System.out.println("| " + inputs[0][0] + " " + inputs[0][1] + " " + inputs[0][2] + " |");
        System.out.println("| " + inputs[1][0] + " " + inputs[1][1] + " " + inputs[1][2] + " |");
        System.out.println("| " + inputs[2][0] + " " + inputs[2][1] + " " + inputs[2][2] + " |");
        System.out.println("---------");
    }

    public static void turn(){
        if (oTurn == false){
            xTurn = true;
        } else if (xTurn == false){
            oTurn = true;
        }
    }

    public static void enterInput(){
        while (isFinished == false && xWins == false && oWins == false){
            turn();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter coordinates: ");
            String xInput = scanner.next();
            String yInput = scanner.next();

            try {
                if (xTurn == true){
                    if (Integer.parseInt(xInput) > 3 || Integer.parseInt(yInput) > 3){
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 1 && (inputs[0][0] != 'X' && inputs[0][0] !='O')) {
                        inputs[0][0] = 'X';
                        xTurn = false;
                        oTurn = true;
                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 2 && (inputs[0][1] != 'X' && inputs[0][1] !='O')) {
                        inputs[0][1] = 'X';
                        xTurn = false;
                        oTurn = true;
                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 3 && (inputs[0][2] != 'X' && inputs[0][2] !='O')) {
                        inputs[0][2] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 1 && (inputs[1][0] != 'X' && inputs[1][0] !='O')) {
                        inputs[1][0] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 2 && (inputs[1][1] != 'X' && inputs[1][1] !='O')) {
                        inputs[1][1] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 3 && (inputs[1][2] != 'X' && inputs[1][2] !='O')) {
                        inputs[1][2] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 1 && (inputs[2][0] != 'X' && inputs[2][0] !='O')) {
                        inputs[2][0] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 2 && (inputs[2][1] != 'X' && inputs[2][1] !='O')) {
                        inputs[2][1] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 3 && (inputs[2][2] != 'X' && inputs[2][2] !='O')) {
                        inputs[2][2] = 'X';
                        xTurn = false;
                        oTurn = true;

                    }else {
                        System.out.println("This cell is occupied!");
                    }

                } else if (oTurn == true) {
                    if (Integer.parseInt(xInput) > 3 || Integer.parseInt(yInput) > 3){
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 1 && (inputs[0][0] != 'X' && inputs[0][0] !='O')) {
                        inputs[0][0] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 2 && (inputs[0][1] != 'X' && inputs[0][1] !='O')) {
                        inputs[0][1] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 1 && Integer.parseInt(yInput) == 3 && (inputs[0][2] != 'X' && inputs[0][2] !='O')) {
                        inputs[0][2] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 1 && (inputs[1][0] != 'X' && inputs[1][0] !='O')) {
                        inputs[1][0] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 2 && (inputs[1][1] != 'X' && inputs[1][1] !='O')) {
                        inputs[1][1] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 2 && Integer.parseInt(yInput) == 3 && (inputs[1][2] != 'X' && inputs[1][2] !='O')) {
                        inputs[1][2] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 1 && (inputs[2][0] != 'X' && inputs[2][0] !='O')) {
                        inputs[2][0] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 2 && (inputs[2][1] != 'X' && inputs[2][1] !='O')) {
                        inputs[2][1] = 'O';
                        oTurn = false;

                    }
                    else if (Integer.parseInt(xInput) == 3 && Integer.parseInt(yInput) == 3 && (inputs[2][2] != 'X' && inputs[2][2] !='O')) {
                        inputs[2][2] = 'O';
                        oTurn = false;
                    }else {
                        System.out.println("This cell is occupied!");
                    }

                }

            }catch (NumberFormatException exception){
                System.out.println("You should enter numbers!");
            }
            displayGameBoard();
            winCondition();
            gameOutput();
            gameEnded();
        }
    }

    public static void gameEnded(){
        int counter =0;
        for (int i = 0; i < inputs.length; i++){
            for (int j = 0; j < inputs[i].length; j++){
                if (inputs[i][j] == 'X' || inputs[i][j] == 'O'){
                    counter++;
                }
            }
        }
        if (counter == 9){
            isFinished = true;
        }else {
            isFinished = false;
        }
    }

    public static void winCondition(){
        int line = 0;
        for (int i = 0; i < 8; i++){
            switch (i){
                case 0:
                    line = inputs[0][0] + inputs[0][1] + inputs[0][2];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 1:
                    line = inputs[1][0] + inputs[1][1] + inputs[1][2];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 2:
                    line = inputs[2][0] + inputs[2][1] + inputs[2][2];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 3:
                    line = inputs[0][0] + inputs[1][0] + inputs[2][0];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 4:
                    line = inputs[0][1] + inputs[1][1] + inputs[2][1];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 5:
                    line = inputs[0][2] + inputs[1][2] + inputs[2][2];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 6:
                    line = inputs[0][0] + inputs[1][1] + inputs[2][2];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
                case 7:
                    line = inputs[0][2] + inputs[1][1] + inputs[2][0];
                    if (line == 264){
                        xWins = true;
                        isFinished = true;
                    }
                    else if (line == 237){
                        oWins = true;
                        isFinished = true;
                    }
                    break;
            }
        }
    }
    public static void gameOutput(){
        if (xWins == true && oWins == false){
            System.out.println("X Wins!");
        }
        else if (oWins == true && xWins == false) {
            System.out.println("O Wins!");
        }
       /* else if (isFinished == false){
            System.out.println("Game not finished");
        }*/
        else if (isFinished == true && xWins == false && oWins == false){
            System.out.println("Draw");
            isFinished = true;
        }
        else if (xWins == true && oWins == true || xCounter>oCounter+1 || oCounter>xCounter+1){
            System.out.println("Impossible");
            isFinished = true;
        }
    }
}



