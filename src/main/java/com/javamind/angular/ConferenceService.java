package com.javamind.angular;

import com.javamind.angular.dto.Conference;
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
public class ConferenceService {

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

}
