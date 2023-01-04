package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        //con el metodo IN podemos introducir datos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombrerecibido = scanner.nextLine();


        System.out.println("El nombre introducido es " + nombrerecibido);



    }
}
