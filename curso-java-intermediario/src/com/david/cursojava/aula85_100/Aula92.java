package com.david.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();

        System.out.println(timeZone);

        // String[] fusos = TimeZone.getAvailableIDs();
        // for (String fuso : fusos) {
        //     System.out.println(fuso);
        // }

        TimeZone timeZoneSP = TimeZone.getTimeZone("America/Sao_Paulo");

        System.out.println(timeZoneSP.getDisplayName());
        System.out.println(timeZoneSP.getID());

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
        System.out.println(dataFormatada.format(agora.getTime()));

        Calendar agoraSP = Calendar.getInstance(timeZoneSP);
        System.out.println(agoraSP.getTimeZone());
        System.out.println(dataFormatada.format(agoraSP.getTime()));

        agoraSP.add(Calendar.HOUR_OF_DAY, timeZoneSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
        System.out.println(dataFormatada.format(agoraSP.getTime()));
    }

}
