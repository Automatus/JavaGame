import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        boolean gaming = true;
        String[][] table = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        String player1;
        String player2 = "Computer";
        String symbol = "X";
        int counter = 0;
        Scanner usrinput = new Scanner(System.in);

        System.out.println("\n ---- Tic-Tac-Toe ---\n");
        System.out.println("Name player 1:");
        player1 = usrinput.nextLine();
        System.out.println("Multiplayer mode? y/n:");
        String multi = usrinput.nextLine();
        if (multi.equals("y")){
            System.out.println("Name player 2:");
            player2 = usrinput.nextLine();
        }

        while (true){
            printTable(table);
            gaming = checkWinner(table, symbol, player2);
            if (!gaming){break;}
            symbol = "X";
            table = getCoordinates(player1, table, symbol);
            counter = counter + 1;
            printTable(table);
            if (counter == 5){
                System.out.println("You are both winners! :)");
                break;
            }
            gaming = checkWinner(table, symbol, player1);
            if (!gaming){break;}
            symbol = "O";
            table = getCoordinates(player2, table, symbol);
            }
        }

    public static void printTable(String[][] table) {
        System.out.println("\n\n      0   1   2\n");
        System.out.println("0     " + table[0][0] + " | " + table[0][1] + " | " + table[0][2]);
        System.out.println("      -   -   - ");
        System.out.println("1     " + table[1][0] + " | " + table[1][1] + " | " + table[1][2]);
        System.out.println("      -   -   - ");
        System.out.println("2     " + table[2][0] + " | " + table[2][1] + " | " + table[2][2] + "\n");
    }

    public static String[][] getCoordinates(String player, String[][] table, String symbol) {
        if (!player.equals("Computer")) {
            Scanner usrinput = new Scanner(System.in);
            System.out.println(player + ", please give the coordinates");
            String coordinatesinput = usrinput.nextLine();
            int coordinatea = Character.getNumericValue(coordinatesinput.charAt(0));
            int coordinateb = Character.getNumericValue(coordinatesinput.charAt(1));

            if (table[coordinatea][coordinateb].equals(" ")) {
                table[coordinatea][coordinateb] = symbol;
            }
        }else{
            if (table[0][0].equals("X") && table[0][2].equals("X")){table[0][1]= "O";}
            else if (table[1][0].equals("X") && table[1][2].equals("X") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[2][0].equals("X") && table[2][2].equals("X") && table[2][1].equals(" ")){table[2][1]= "O";}
            else if (table[0][0].equals("X") && table[2][0].equals("X") && table[1][0].equals(" ")){table[1][0]= "O";}
            else if (table[0][1].equals("X") && table[2][1].equals("X") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[0][2].equals("X") && table[2][2].equals("X") && table[1][2].equals(" ")){table[1][2]= "O";}
            else if (table[0][0].equals("X") && table[2][2].equals("X") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[2][0].equals("X") && table[0][2].equals("X") && table[1][1].equals(" ")){table[1][1]= "O";}

            else if (table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[0][1].equals("X") && table[0][2].equals("X") && table[0][1].equals(" ")){table[0][1]= "O";}
            else if (table[1][0].equals("X") && table[1][1].equals("X") && table[1][2].equals(" ")){table[1][2]= "O";}
            else if (table[1][1].equals("X") && table[1][2].equals("X") && table[1][0].equals(" ")){table[1][0]= "O";}
            else if (table[2][0].equals("X") && table[2][1].equals("X") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[2][1].equals("X") && table[2][2].equals("X") && table[2][0].equals(" ")){table[2][0]= "O";}
            else if (table[0][0].equals("X") && table[1][0].equals("X") && table[2][0].equals(" ")){table[2][0]= "O";}
            else if (table[1][0].equals("X") && table[2][0].equals("X") && table[0][0].equals(" ")){table[0][0]= "O";}
            else if (table[0][1].equals("X") && table[1][1].equals("X") && table[2][1].equals(" ")){table[2][1]= "O";}
            else if (table[1][1].equals("X") && table[2][1].equals("X") && table[0][1].equals(" ")){table[0][1]= "O";}
            else if (table[0][2].equals("X") && table[1][2].equals("X") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[1][2].equals("X") && table[2][2].equals("X") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[1][1].equals("X") && table[2][2].equals("X") && table[0][0].equals(" ")){table[0][0]= "O";}
            else if (table[2][0].equals("X") && table[1][1].equals("X") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[1][1].equals("X") && table[0][2].equals("X") && table[2][0].equals(" ")){table[2][0]= "O";}

            else if (table[0][0].equals("O") && table[0][2].equals("O") && table[0][1].equals(" ")){table[0][1]= "O";}
            else if (table[1][0].equals("O") && table[1][2].equals("O") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[2][0].equals("O") && table[2][2].equals("O") && table[2][1].equals(" ")){table[2][1]= "O";}
            else if (table[0][0].equals("O") && table[2][0].equals("O") && table[1][0].equals(" ")){table[1][0]= "O";}
            else if (table[0][1].equals("O") && table[2][1].equals("O") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[0][2].equals("O") && table[2][2].equals("O") && table[1][2].equals(" ")){table[1][2]= "O";}
            else if (table[0][0].equals("O") && table[2][2].equals("O") && table[1][1].equals(" ")){table[1][1]= "O";}
            else if (table[2][0].equals("O") && table[0][2].equals("O") && table[1][1].equals(" ")){table[1][1]= "O";}

            else if (table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[0][1].equals("O") && table[0][2].equals("O") && table[0][1].equals(" ")){table[0][1]= "O";}
            else if (table[1][0].equals("O") && table[1][1].equals("O") && table[1][2].equals(" ")){table[1][2]= "O";}
            else if (table[1][1].equals("O") && table[1][2].equals("O") && table[1][0].equals(" ")){table[1][0]= "O";}
            else if (table[2][0].equals("O") && table[2][1].equals("O") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[2][1].equals("O") && table[2][2].equals("O") && table[2][0].equals(" ")){table[2][0]= "O";}
            else if (table[0][0].equals("O") && table[1][0].equals("O") && table[2][0].equals(" ")){table[2][0]= "O";}
            else if (table[1][0].equals("O") && table[2][0].equals("O") && table[0][0].equals(" ")){table[0][0]= "O";}
            else if (table[0][1].equals("O") && table[1][1].equals("O") && table[2][1].equals(" ")){table[2][1]= "O";}
            else if (table[1][1].equals("O") && table[2][1].equals("O") && table[0][1].equals(" ")){table[0][1]= "O";}
            else if (table[0][2].equals("O") && table[1][2].equals("O") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[1][2].equals("O") && table[2][2].equals("O") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals(" ")){table[2][2]= "O";}
            else if (table[1][1].equals("O") && table[2][2].equals("O") && table[0][0].equals(" ")){table[0][0]= "O";}
            else if (table[2][0].equals("O") && table[1][1].equals("O") && table[0][2].equals(" ")){table[0][2]= "O";}
            else if (table[1][1].equals("O") && table[0][2].equals("O") && table[2][0].equals(" ")){table[2][0]= "O";}

            else if (table[0][2].equals(" ")){table[0][2] = "O";}
            else if (table[1][2].equals(" ")){table[1][2] = "O";}
            else if (table[2][2].equals(" ")){table[2][2] = "O";}
            else if (table[0][1].equals(" ")){table[0][1] = "O";}
            else if (table[1][1].equals(" ")){table[1][1] = "O";}
            else if (table[2][1].equals(" ")){table[2][1] = "O";}
            else if (table[0][0].equals(" ")){table[0][0] = "O";}
            else if (table[1][0].equals(" ")){table[1][0] = "O";}
            else if (table[2][0].equals(" ")){table[2][0] = "O";}
        }
        return table;
    }

    public static boolean checkWinner(String[][] table, String symbol, String player){
        boolean gaming = true;
        if ((table[0][0].equals(symbol) && table[0][1].equals(symbol) && table[0][2].equals(symbol)) ||
        (table[1][0].equals(symbol) && table[1][1].equals(symbol) && table[1][2].equals(symbol)) ||
        (table[2][0].equals(symbol) && table[2][1].equals(symbol) && table[2][2].equals(symbol)) ||
        (table[0][0].equals(symbol) && table[1][0].equals(symbol) && table[2][0].equals(symbol)) ||
        (table[0][1].equals(symbol) && table[1][1].equals(symbol) && table[2][1].equals(symbol)) ||
        (table[0][2].equals(symbol) && table[1][2].equals(symbol) && table[2][2].equals(symbol)) ||
        (table[0][0].equals(symbol) && table[1][1].equals(symbol) && table[2][2].equals(symbol)) ||
        (table[2][0].equals(symbol) && table[1][1].equals(symbol) && table[0][2].equals(symbol))){
            System.out.println(player + " has won!");
            gaming = false;
        }
        return gaming;
    }
}
