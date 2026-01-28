package com.kaykamaral.SpringStudies.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Instant moment;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment() {}
    public Payment(Integer id, Instant moment, Order order) {
        this.id = id; this.moment = moment; this.order = order;
    }

    public void setId(Integer id) { this.id = id; }
    public void setMoment(Instant moment) { this.moment = moment; }
    public void setOrder(Order order) { this.order = order; }

    public Integer getId() { return id; }
    public Instant getMoment() { return moment; }
    public Order getOrder() { return order; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}