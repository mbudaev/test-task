package com.mbudaev.builders;

import com.mbudaev.domain.Address;
import com.mbudaev.domain.Client;
import com.mbudaev.domain.Order;

/**
 * Created by Миша on 19.06.2016.
 */
public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder setDeliveryDate(String deliveryDate) {
        this.order.setDeliveryDate(deliveryDate);
        return this;
    }

    public OrderBuilder setDeliveryShift(String deliveryShift) {
        this.order.setShift(deliveryShift);
        return this;
    }

    public OrderBuilder setorderNumber(int orderNumber) {
        this.order.setOrderNumber(orderNumber);
        return this;
    }

    public OrderBuilder setOrderType(String orderType) {
        this.order.setOrderType(orderType);
        return this;
    }

    public OrderBuilder setVolume(double volume) {
        this.order.setVolume(volume);
        return this;
    }

    public OrderBuilder setUnitsQuntity(String unitsQuntity) {
        this.order.setUnitsQuantity(unitsQuntity);
        return this;
    }

    public OrderBuilder setUnitsType(String unitsType) {
        this.order.setUnitsType(unitsType);
        return this;
    }

    public OrderBuilder setDeliveryMode(String deliveryMode) {
        this.order.setDeliveryMode(deliveryMode);
        return this;
    }

    public OrderBuilder setDestinationAddress(Address destinationAddress) {
        this.order.setAddress(destinationAddress);
        return this;
    }

    public OrderBuilder setClientInfo(Client clientInfo) {
        this.order.setClient(clientInfo);
        return this;
    }

    public Order build() {
        return order;
    }
}
