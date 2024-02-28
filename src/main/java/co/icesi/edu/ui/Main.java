package co.icesi.edu.ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba ek numero de columnas");
        int columnas = scanner.nextInt();

        System.out.println("Escriba ek numero de filas");
        int filas = scanner.nextInt();

        System.out.println("Menú");
        System.out.println("------------------");
        System.out.println("1. Tirar dado");
        System.out.println("2. Ver tablero");
        System.out.println("3. Salir");
        System.out.println("------------------");


    }
}
