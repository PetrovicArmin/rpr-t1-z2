package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite neki prirodni broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.println("Broj " + i + " je djeljiv sa svojom sumom cifara, koja iznosi : " + sumaCifara(i));
        }
        ulaz.close();
    }

    private static int sumaCifara(int i) {
        int suma = 0;
        do {
            suma = suma + (i % 10);
            i = i / 10;
        } while (i != 0);
        return suma;
    }
}
