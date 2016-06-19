package com.mbudaev.domain;

/**
 * Created by Миша on 19.06.2016.
 */
public class Order {
    private String deliveryDate;
    private String shift;
    private int orderNumber;
    private String orderType;
    private double volume;
    private String unitsQuantity;
    private String unitsType;
    private String deliveryMode;
    private Address address;
    private Client client;

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getUnitsQuantity() {
        return unitsQuantity;
    }

    public void setUnitsQuantity(String unitsQuantity) {
        this.unitsQuantity = unitsQuantity;
    }

    public String getUnitsType() {
        return unitsType;
    }

    public void setUnitsType(String unitsType) {
        this.unitsType = unitsType;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "deliveryDate='" + deliveryDate + '\'' +
                ", shift='" + shift + '\'' +
                ", orderNumber=" + orderNumber +
                ", orderType='" + orderType + '\'' +
                ", volume=" + volume +
                ", unitsQuantity='" + unitsQuantity + '\'' +
                ", unitsType='" + unitsType + '\'' +
                ", deliveryMode='" + deliveryMode + '\'' +
                ", address=" + address +
                ", client=" + client +
                '}';
    }
}
