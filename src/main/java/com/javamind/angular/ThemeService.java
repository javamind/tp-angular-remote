package com.javamind.angular;

import com.javamind.angular.dto.Theme;
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
public class ThemeService {

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

}
