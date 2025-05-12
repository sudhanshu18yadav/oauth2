package com.example.oauth2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;

    public Integer getId() {
        return this.id;
    }

    public Forest setName(String _name) {
        this.name = _name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public Forest setType(String _type) {
        this.type = _type;
        return this;
    }
}
