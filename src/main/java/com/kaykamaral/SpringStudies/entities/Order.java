package com.kaykamaral.SpringStudies.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private User client;

    public Order() {}

    public Order(Integer id, Instant moment, User client) {
        this.id = id; this.moment = moment; this.client = client;
    }

    public void setId(Integer id) { this.id = id; }
    public void setMoment(Instant moment) { this.moment = moment; }
    public void setClient(User client) { this.client = client; }

    public Integer getId() { return id; }
    public Instant getMoment() { return moment; }
    public User getClient() { return client; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}