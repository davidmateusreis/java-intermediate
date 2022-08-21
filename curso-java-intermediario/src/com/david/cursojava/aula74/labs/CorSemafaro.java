package com.david.cursojava.aula74.labs;

public enum CorSemafaro {

    VERDE(3000), AMARELO(1000), VERMELHO(2000);

    private int tempoEspera;

    CorSemafaro(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

}
