package com.company;
import java.util.Scanner;
public class POO09 {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 0;

        System.out.println("Introduce un numero (0 para acabar): ");

        numero = Keyboard.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
                System.out.println("Introduce un numero (0 para acabar): ");
                numero = Keyboard.nextInt();
            }
            }

        }