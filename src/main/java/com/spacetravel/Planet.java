package com.spacetravel;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z0-9]+", message = "ID must contain only uppercase letters and digits")
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Column(name = "name", nullable = false, length = 500)
    private String name;

    @OneToMany(mappedBy = "fromPlanet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ticket> ticketsFrom;

    @OneToMany(mappedBy = "toPlanet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ticket> ticketsTo;

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

    public Set<Ticket> getTicketsFrom() {
        return ticketsFrom;
    }

    public void setTicketsFrom(Set<Ticket> ticketsFrom) {
        this.ticketsFrom = ticketsFrom;
    }

    public Set<Ticket> getTicketsTo() {
        return ticketsTo;
    }

    public void setTicketsTo(Set<Ticket> ticketsTo) {
        this.ticketsTo = ticketsTo;
    }
}
