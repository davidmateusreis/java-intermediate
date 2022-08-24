package com.david.cursojava.aula85_100;

import java.util.Random;

public class Aula99 {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 100));

        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt());

        System.out.println(aleatorio.nextInt(101));
        System.out.println(aleatorio.nextInt(6 + 1));
        
    }
}
