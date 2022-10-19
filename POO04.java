package com.company;
import java.util.Scanner;

public class POO04 {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int NumeroSemana = 0;

        System.out.println("Ingrese el dia de la semana del 1 al 7");

        NumeroSemana = Keyboard.nextInt();

        switch (NumeroSemana) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}