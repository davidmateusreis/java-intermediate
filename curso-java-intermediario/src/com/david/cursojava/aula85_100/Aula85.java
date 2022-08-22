package com.david.cursojava.aula85_100;

public class Aula85 {

    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3)); // potência

        System.out.println(Math.round(2.7)); // arredondamento (baixo <.5 cima > .5)
        System.out.println(Math.round(2.4));

        System.out.println(Math.ceil(6.4)); // arredondamento pra cima
        System.out.println(Math.ceil(6.7));

        System.out.println(Math.floor(8.4)); // arredondamento pra baixo
        System.out.println(Math.floor(8.7));

        System.out.println(Math.round(Math.random() * 10));

        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(1)));
        System.out.println(Math.tan(Math.toRadians(45)));

    }
}
