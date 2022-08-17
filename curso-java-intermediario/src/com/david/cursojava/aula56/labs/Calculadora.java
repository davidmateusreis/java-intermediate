package com.david.cursojava.aula56.labs;

public class Calculadora {
    
    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double a, double b) {
                return a + b;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double a, double b) {
                return a - b;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double a, double b) {
                return a * b;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double a, double b) {
                return a / b;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double a, double b);

        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {
        
        double a = 2.0;
        double b = 3.0;

        for(Operacao op : Operacao.values()) {
            System.out.print(a + " ");
            System.out.print(op.toString() + " ");
            System.out.print(b + " = ");
            System.out.println(op.executarOperacao(a, b));

        }
    }
}
