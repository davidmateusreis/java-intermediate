package com.david.cursojava.aula75_84;

public class Pessoa {

    private int cod;
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, int idade) {
        this.cod = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int codigo) {
        this.cod = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [cod=" + cod + ", idade=" + idade + ", nome=" + nome + "]";
    }

}
