import java.util.Scanner;

public class Maze {
    static byte getX(byte coord) {
        return (byte) (coord & 0b0011);
    }

    static byte getY(byte coord) {
        return (byte) ((coord & 0b1100) >> 2);
    }

    static byte makeCoord(byte x, byte y) {
        return (byte) ((y << 2) | (x & 0b0011));
    }

    static boolean hasNExit(byte coord) {
        return getY(coord) < 3 && (getY(coord) == 1 || ((coord & 0b0001) == ((coord & 0b0100) >> 2)));
    }

    static boolean hasSExit(byte coord) {
        return getY(coord) > 0 && (getY(coord) == 2 || ((coord & 0b0001) != (coord & 0b0100) >> 2));
    }

    static boolean hasEExit(byte coord) {
        return getX(coord) < 3 && ((coord & 0b0001) != (coord & 0b0100) >> 2);
    }

    static boolean hasWExit(byte coord) {
        return getX(coord) > 0 && ((coord & 0b0001) == (coord & 0b0100) >> 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        byte currentCoord = makeCoord((byte) 0, (byte) 0);

        System.out.println("You are in a maze.");

        while (play) {
            // Aktuelle Koordinaten und mögliche Ausgänge anzeigen
            System.out.println("Current coordinates: (" + getX(currentCoord) + ", " + getY(currentCoord) + ")");
            System.out.println("Possible exits: ");
            if (hasNExit(currentCoord)) {
                System.out.println("north");
            }
            if (hasSExit(currentCoord)) {
                System.out.println("south");
            }
            if (hasEExit(currentCoord)) {
                System.out.println("east");
            }
            if (hasWExit(currentCoord)) {
                System.out.println("west");
            }

            // Spielerbewegung
            String move = scanner.nextLine();

            if ((move.equals("north") || move.equals("n")) && hasNExit(currentCoord)) {
                currentCoord = makeCoord(getX(currentCoord), (byte) (getY(currentCoord) + 1));
            } else if ((move.equals("south") || move.equals("s")) && hasSExit(currentCoord)) {
                currentCoord = makeCoord(getX(currentCoord), (byte) (getY(currentCoord) - 1));
            } else if ((move.equals("east") || move.equals("e")) && hasEExit(currentCoord)) {
                currentCoord = makeCoord((byte) (getX(currentCoord) + 1), getY(currentCoord));
            } else if ((move.equals("west") || move.equals("w")) && hasWExit(currentCoord)) {
                currentCoord = makeCoord((byte) (getX(currentCoord) - 1), getY(currentCoord));
            } else {
                System.out.println("Invalid move.");
            }

            // Siegbedingung überprüfen
            if (getX(currentCoord) == 3 && getY(currentCoord) == 3) {
                System.out.println("You win.");
                play = false;
            }
        }
        scanner.close();
    }

}
