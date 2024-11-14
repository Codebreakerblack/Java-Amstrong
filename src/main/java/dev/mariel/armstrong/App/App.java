package dev.mariel.armstrong.App;

import java.util.Scanner;

import dev.mariel.armstrong.service.NumArmstrong;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        System.out.println(
                (NumArmstrong.checkArmstrong(num)) ? num + " es un Armstrong" : num + " no es un Armstrong");

        scanner.close();
    }
}
