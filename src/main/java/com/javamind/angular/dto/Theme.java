package com.javamind.angular.dto;

import java.io.Serializable;

/**
 * {@link }
 *
 * @author EHRET_G
 */
public class Theme implements Serializable {
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
