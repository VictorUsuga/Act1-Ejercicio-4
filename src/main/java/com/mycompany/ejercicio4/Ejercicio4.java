package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int edjuan, edalberto, edana, edmama;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese edad de Juan");
        edjuan = entrada.nextInt();
        edalberto = 2 * (edjuan/3);
        edana = 4 * (edjuan/3);
        edmama = edjuan + edalberto + edana;
        
        System.out.println("La edad de la mamá es: " + edmama);
        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        
    }
}
    