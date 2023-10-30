import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        double angka1, angka2, hasil;
        char operator;

        out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    out.println("Hasil: " + hasil);
                } else {
                    out.println("Pembagian oleh nol tidak diperbolehkan.");
                }
                break;
            default:
                out.println("Operator tidak valid.");
        }
    }
}
