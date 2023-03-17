package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {
    public double [] getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int size = sc.nextInt();
        double [] tab  = new double[size];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbę:" + (i + 1));
            tab[i] = sc.nextInt();
        }
        return tab;
    }

    public  void  getSumOfSquares(double [] tab) {
        int sum = 0;
        for (double numbers : tab) {
            sum += Math.pow(numbers, 2);
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }
}



