package com.david.cursojava.aula54;

public class TesteEnum {
    
    public static void main(String[] args) {
        
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(2, 5, 2022, DiaSemana.SEGUNDA);
    }
}
