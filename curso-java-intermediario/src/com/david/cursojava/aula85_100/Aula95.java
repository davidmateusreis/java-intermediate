package com.david.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95 {
    
    public static void main(String[] args) {
        
        System.out.println("Locale atual " + Locale.getDefault());

        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Olá " + rb.getString("hello"));
        System.out.println("Mundo " + rb.getString("world"));

        Locale.setDefault(new Locale("en_US", "en_US"));
        rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Hello " + rb.getString("hello"));
        System.out.println("World " + rb.getString("world"));

    }
}
