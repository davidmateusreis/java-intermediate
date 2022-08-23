package com.david.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94 {

    public static void main(String[] args) {

        try {
            diferencaDataAteJava7();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("---------");
        diferencaDataJava8();

        System.out.println("---------");
        diferencaDataJava8ComTempo();

        System.out.println("---------");
        diferencaDataJava8ComChronoUnit();
    }

    public static void diferencaDataAteJava7() throws ParseException {

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraData = dataFormatada.parse("23/08/2022");
        Date segundaData = dataFormatada.parse("23/09/2022");

        long diferencaEmMil = Math.abs(segundaData.getTime() - primeiraData.getTime());

        long diferenca = TimeUnit.DAYS.convert(diferencaEmMil, TimeUnit.MILLISECONDS);

        int dias = (int) (diferencaEmMil / (1000 * 60 * 60 * 24));

        System.out.println(diferenca);
        System.out.println(dias);

    }

    public static void diferencaDataJava8() {
        LocalDate data1 = LocalDate.of(2022, 8, 23);
        LocalDate data2 = LocalDate.of(2022, 9, 13);

        Period periodo = Period.between(data1, data2);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int anos = periodo.getYears();

        System.out.println("Dias: " + dias);
        System.out.println("Meses: " + meses);
        System.out.println("Anos: " + anos);
    }

    public static void diferencaDataJava8ComTempo() {
        LocalDateTime data1 = LocalDateTime.of(2022, 8, 23, 12, 40);
        LocalDateTime data2 = LocalDateTime.of(2022, 8, 23, 14, 40);

        Duration duracao = Duration.between(data1, data2);
        long diferenca = duracao.toHours();

        System.out.println(diferenca);
    }

    public static void diferencaDataJava8ComChronoUnit() {
        LocalDateTime data1 = LocalDateTime.of(2022, 8, 23, 12, 40);
        LocalDateTime data2 = LocalDateTime.of(2022, 8, 23, 16, 40);

        long diferenca = ChronoUnit.HOURS.between(data1, data2);
        long diferencaDias = ChronoUnit.DAYS.between(data1, data2);

        System.out.println(diferenca);
        System.out.println(diferencaDias);
    }
}
