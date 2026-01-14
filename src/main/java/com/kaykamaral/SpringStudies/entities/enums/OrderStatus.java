package com.kaykamaral.SpringStudies.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;
    private OrderStatus(int code) { this.code = code; }

    public int getCode() { return code; }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus s : OrderStatus.values()) {
            if (s.getCode() == code) { return s; }
        }
        throw new IllegalArgumentException("Invalid Order Status code");
    }

}
