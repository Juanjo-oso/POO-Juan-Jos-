package com.company;
import java.util.Scanner;

public class POO02 {


    public static Scanner Keyboard = new Scanner (System.in);

    public static void main(String[] args) {

        double DOLAR = 0.00022;
        double CONVERSOR = 0;
        double RESULTADO = 0;

        System.out.println("Ingrese los pesos que desea cambiar a dolares.");
        CONVERSOR = Keyboard.nextInt();


        RESULTADO = CONVERSOR*DOLAR;

        System.out.println("La conversion es " + RESULTADO + " Dolares");
    }
}
