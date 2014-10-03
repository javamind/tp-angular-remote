package com.javamind.angular.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * {@link }
 *
 * @author EHRET_G
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Conference implements Serializable{
    private Long id;
    private String name;
    private String description;
    private String place;
    private String country;
    private Date startdate;
    private Date enddate;
    private Long attendees;
    private Long price;
    private String image;
    private List<Integer> themes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Conference setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Conference setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Conference setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Conference setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Conference setCountry(String country) {
        this.country = country;
        return this;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Conference setStartdate(Date startdate) {
        this.startdate = startdate;
        return this;
    }

    public Date getEnddate() {
        return enddate;
    }

    public Conference setEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }

    public Long getAttendees() {
        return attendees;
    }

    public Conference setAttendees(Long attendees) {
        this.attendees = attendees;
        return this;

    }

    public Long getPrice() {
        return price;
    }

    public Conference setPrice(Long price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Conference setImage(String image) {
        this.image = image;
        return this;
    }

    public Conference addThemes(Integer id) {
        themes.add(id);
        return this;
    }

    public Conference removeThemes(Integer id) {
        themes.remove(id);
        return this;
    }

    public List<Integer> getThemes() {
        return themes;
    }
    public Conference setThemes(List<Integer> themes) {
        this.themes = themes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conference that = (Conference) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
