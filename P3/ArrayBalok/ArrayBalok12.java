package P3.ArrayBalok;

public class ArrayBalok12 {
    public static void main(String[] args) {
        Balok12[] blArray = new Balok12[3];

        blArray[0] = new Balok12(100, 30,  12);
        blArray[1] = new Balok12(120, 40,  15);
        blArray[2] = new Balok12(210, 50,  25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
