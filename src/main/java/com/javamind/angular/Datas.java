package com.javamind.angular;

import com.javamind.angular.dto.Conference;
import com.javamind.angular.dto.Theme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * {@link }
 *
 * @author EHRET_G
 */
public class Datas {

    /**
     * Class util
     */
    private Datas() {
    }

    public static List<Theme> getThemes() {
        return Arrays.asList(
                new Theme().setId(1L).setLabel("Java"),
                new Theme().setId(2L).setLabel("Angular JS"),
                new Theme().setId(3L).setLabel("Agilite"),
                new Theme().setId(4L).setLabel("Android"),
                new Theme().setId(5L).setLabel("Mobilité"),
                new Theme().setId(6L).setLabel("Javascript"),
                new Theme().setId(7L).setLabel("HTML 5"),
                new Theme().setId(8L).setLabel("CSS"),
                new Theme().setId(9L).setLabel(".NET"),
                new Theme().setId(10L).setLabel("Cloud"),
                new Theme().setId(11L).setLabel("Test"),
                new Theme().setId(12L).setLabel("Web")
        );
    }

    public static List<Conference> getConferences() {
        return Arrays.asList(
                new Conference()
                        .setId(1L)
                        .setName("Mix-IT")
                        .setDescription("Des conférences pour faire des découvertes, des jeux pour apprendre, des ateliers de développement ou créatifs, Mix-IT c\\'est 2 jours intenses de progrès et de rencontres ! La soirée, ouverte à tous, est aussi le moment idéal pour faire des connaissances et s\'ouvrir aux autres cultures.")
                        .setPlace("Lyon")
                        .setCountry("France")
                        .setStartdate(Date.from(LocalDateTime.of(2014, Month.APRIL, 29, 8, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setEnddate(Date.from(LocalDateTime.of(2014, Month.APRIL, 29, 8, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setAttendees(500L)
                        .setPrice(50L)
                        .setImage("images/logos/mixit.png")
                        .addThemes(1).addThemes(3).addThemes(5).addThemes(12),
                new Conference()
                        .setId(2L)
                        .setName("DevoxxFr")
                        .setDescription("La conférence des développeurs passionnés.")
                        .setPlace("Paris")
                        .setCountry("France")
                        .setStartdate(Date.from(LocalDateTime.of(2014, Month.MARCH, 16, 9, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setEnddate(Date.from(LocalDateTime.of(2014, Month.MARCH, 18, 18, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setAttendees(1500L)
                        .setPrice(650L)
                        .setImage("images/logos/devoxx.png")
                        .addThemes(1).addThemes(3).addThemes(5).addThemes(12),
                new Conference()
                        .setId(3L)
                        .setName("Blend webmix")
                        .setDescription("La conférence web la plus importante de France. 2 jours de conférences, ateliers, rencontres autour du web ")
                        .setPlace("Lyon")
                        .setCountry("France")
                        .setStartdate(Date.from(LocalDateTime.of(2014, Month.OCTOBER, 29, 9, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setEnddate(Date.from(LocalDateTime.of(2014, Month.OCTOBER, 30, 18, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setAttendees(500L)
                        .setPrice(239L)
                        .setImage("images/logos/blend.png")
                        .addThemes(6).addThemes(7).addThemes(8).addThemes(10).addThemes(12),
                new Conference()
                        .setId(4L)
                        .setName("Jug summer camp")
                        .setDescription("Le jug summer camp est la conférénce incontournable à la fin de l'été pour parler Cloud, NoSQL, Web...")
                        .setPlace("La Rochelle")
                        .setCountry("France")
                        .setStartdate(Date.from(LocalDateTime.of(2014, Month.SEPTEMBER, 18, 9, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setEnddate(Date.from(LocalDateTime.of(2014, Month.SEPTEMBER, 18, 18, 0, 0).toInstant(ZoneOffset.UTC)))
                        .setAttendees(170L)
                        .setPrice(0L)
                        .setImage("images/logos/logo-summercamp.png")
                        .addThemes(1).addThemes(2).addThemes(3).addThemes(4).addThemes(5).addThemes(6).addThemes(10).addThemes(11)
        );
    }
}
