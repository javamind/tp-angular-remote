package com.javamind.angular;

import com.javamind.angular.dto.Conference;
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
@RequestMapping("/conference")
public class ConferenceService {

    @RequestMapping
    public List<Conference> conferences() {
        return Datas.conferences;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Conference conference(@PathVariable Long id) {
        return Datas.conferences
                .stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Conference update(@RequestBody Conference conf) {
        if(conf.getName() == null || conf.getName().length()==0){
            throw new NullPointerException("Le nom  et l'ID de la conference sont obligatoires");
        }

        Optional<Conference> conference = Optional.empty();
        //On recherche la conf et on la modifie
        if(conf.getId()!=null) {
            conference = Datas.conferences
                    .stream()
                    .filter(c -> conf.getId().equals(c.getId()))
                    .findFirst();
        }

        conference.ifPresent(c -> BeanUtils.copyProperties(conf, c));
        if(!conference.isPresent()){
            Optional<Long> maxid = Datas.conferences
                    .stream()
                    .map(c -> c.getId())
                    .max((id1, id2) -> id1.compareTo(id2));

            //On ajoute notre objet dans la liste
            conf.setId(maxid.orElse(1L) +10L);
            Datas.conferences.add(conf);
        }
        return conf;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        if(id==null){
            throw new NullPointerException("L'ID de la conference sont obligatoires");
        }

        //On recherche la conf et on la modifie
        Datas.conferences
                .stream()
                .filter(c -> id.equals(c.getId()))
                .findFirst()
                .ifPresent(c -> Datas.conferences.remove(c));
    }
}
