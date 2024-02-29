package P2.dragonGame;

import java.util.Scanner;
public class dragonMain12 {
    public static void main(String[] args) {
        Scanner scanner12 = new Scanner(System.in);
        dragon12 dragon = new dragon12(5 ,2,  10, 10);
        while (true) {
            dragon.printPosition();
            System.out.print("Masukkan (W/A/S/D) untuk gerak: ");
            String input = scanner12.nextLine();

            switch (input.toUpperCase()) {
                case "W":
                    dragon.moveUp();
                    break;
                case "A":
                    dragon.moveLeft();
                    break;
                case "S":
                    dragon.moveDown();
                    break;
                case "D":
                    dragon.moveRight();
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    break;
            }
        }
    }
}


