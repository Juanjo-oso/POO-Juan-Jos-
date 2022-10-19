package com.company;

import java.util.Scanner;

public class POO012 {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);


    System.out.print("Ingrese 10 números: ");
    int[] num = new int [10];
	for(int i = 0; i < 10; i++)
    {
        num[i] = Keyboard.nextInt();
    }
	System.out.println("Números al reves: " );
    int j = 9;
while(j >= 0) {
        System.out.println(num[j]);
        j--;
    }
}
}
