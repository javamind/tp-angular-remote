package com.javamind.angular;

import com.javamind.angular.dto.Conference;
import com.javamind.angular.dto.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@link }
 *
 * @author EHRET_G
 */
@RestController
@EnableAutoConfiguration
public class TpAngularServer {

    @RequestMapping("/conference")
    public List<Conference> conferences() {
        return Datas.getConferences();
    }

    @RequestMapping("/conference/{id}")
    public Conference conference(@PathVariable Long id) {
        return Datas.getConferences()
                .stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }

    @RequestMapping("/theme")
    public List<Theme> themes() {
        return  Datas.getThemes();
    }

    @RequestMapping("/theme/{id}")
    public Theme theme(@PathVariable Long id) {
        return Datas.getThemes()
                .stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TpAngularServer.class, args);
    }
}
