package com.spacetravel;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z0-9]+", message = "ID must contain only uppercase letters and digits")
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Column(name = "name", nullable = false, length = 500)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
