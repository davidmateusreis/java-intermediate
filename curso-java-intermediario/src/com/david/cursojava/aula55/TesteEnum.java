package com.david.cursojava.aula55;

import com.david.cursojava.aula54.DiaSemana;

public class TesteEnum {
    
    public static void main(String[] args) {
        
        DiaSemana[] dias = DiaSemana.values(); //O métodos values retorna um array de todos os valores dentro do enum

        for(int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }

        
    }
}
