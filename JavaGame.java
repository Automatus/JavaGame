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
        Scanner usrinput = new Scanner(System.in);

        System.out.println("\n Boter Kaas en eieren  ---  The GAME \n");
        System.out.println("Name player 1:");
        player1 = usrinput.nextLine();
        System.out.println("Multiplayer mode? y/n:");
        String multi = usrinput.nextLine();
        if (multi.equals("y")){
            System.out.println("Name player 2:");
            player2 = usrinput.nextLine();
        }

        while (gaming){
            printTable(table);
            table = getCoordinates(player1, table, symbol);
            symbol = "O";
            printTable(table);
            table = getCoordinates(player2, table, symbol);
            symbol = "X";
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
        Scanner usrinput = new Scanner(System.in);
        System.out.println(player + ", please give the coordinates");
        String coordinatesinput = usrinput.nextLine();
        int coordinatea = Character.getNumericValue(coordinatesinput.charAt(0));
        int coordinateb = Character.getNumericValue(coordinatesinput.charAt(1));

        if (table[coordinatea][coordinateb].equals(" ")){
            table[coordinatea][coordinateb] = symbol;
        }
        return table;
    }
    public static boolean checkWinner(String[][] table){
        
    boolean gaming = true;
    return gaming;
    }
}
