package com.david.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {

    public static void main(String[] args) {

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");

        Calendar data = new GregorianCalendar(2022, 7, 23, 9, 40, 20);

        System.out.println(dataFormatada.format(data.getTime()));

        Date hoje = new Date();

        System.out.println(dataFormatada.format(hoje));

        String d = dataFormatada.format(hoje);

        SimpleDateFormat dataFormatada1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "23/08/2022";

        try {
            Date minhaDataEmDate = dataFormatada1.parse(minhaData);

            System.out.println(minhaDataEmDate);

            System.out.println(dataFormatada.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
