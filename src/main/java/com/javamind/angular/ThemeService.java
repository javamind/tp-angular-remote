package com.javamind.angular;

import com.javamind.angular.dto.Theme;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * {@link }
 *
 * @author EHRET_G
 */
@RestController
public class ThemeService {

    @RequestMapping("/theme")
    public List<Theme> themes() {
        return  Datas.themes;
    }

    @RequestMapping("/theme/{id}")
    public Theme theme(@PathVariable Long id) {
        return Datas.themes
                .stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json")
    public Theme update(@RequestBody Theme theme) {
        if(theme.getLabel() == null || theme.getLabel().length()==0){
            throw new NullPointerException("Le nom  et l'ID du theme sont obligatoires");
        }

        //On recherche la conf et on la modifie
        Optional<Theme> th = Datas.themes
                .stream()
                .filter(c -> theme.getId().equals(c.getId()))
                .findFirst();

        th.ifPresent(c -> BeanUtils.copyProperties(th, c));
        if(!th.isPresent()){
            //On ajoute notre objet dans la liste
            Datas.themes.add(theme);
        }
        return theme;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        if(id==null){
            throw new NullPointerException("L'ID de la theme sont obligatoires");
        }

        //On recherche la conf et on la modifie
        Datas.themes
                .stream()
                .filter(c -> id.equals(c.getId()))
                .findFirst()
                .ifPresent(c -> Datas.themes.remove(c));
    }

}
