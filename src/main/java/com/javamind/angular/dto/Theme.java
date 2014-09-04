package com.javamind.angular.dto;

/**
 * {@link }
 *
 * @author EHRET_G
 */
public class Theme {
    private Long id;
    private String label;

    public Long getId() {
        return id;
    }

    public Theme setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Theme setLabel(String label) {
        this.label = label;
        return this;
    }
}
