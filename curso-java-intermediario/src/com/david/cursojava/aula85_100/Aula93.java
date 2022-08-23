package com.david.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93 {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2022, 8, 23));

        System.out.println(LocalDate.parse("2022-08-23"));

        System.out.println(agora.plusDays(30));
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());

        System.out.println(LocalDate.of(2022, 8, 23).isLeapYear());

        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(10, 48));
        System.out.println(LocalTime.parse("10:48"));

        System.out.println(hAgora.plusMinutes(60));
        System.out.println(hAgora.minus(40, ChronoUnit.HOURS));

        System.out.println(hAgora.getHour());

        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(LocalDateTime.of(2022, 8, 23, 12, 16, 40));
        System.out.println(LocalDateTime.parse("2022-08-23T12:13:19"));
        System.out.println(agoraCompleto.plusYears(20));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for (String f : fusos) {
            System.out.println(f);
        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-08-23T12:13:19"), sp);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2022-08-23T12:13:19-03:00[America/Sao_Paulo]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetDateTime);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.ofInstant(calendar.toInstant(), sp));

    }
}
