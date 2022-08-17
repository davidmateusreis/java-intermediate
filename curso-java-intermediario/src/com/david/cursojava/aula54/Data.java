package com.david.cursojava.aula54;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diasSemana;

    public Data() {
    }

    public Data(int dia, int mes, int ano, DiaSemana diasSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diasSemana = diasSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(DiaSemana diasSemana) {
        this.diasSemana = diasSemana;
    }

}
