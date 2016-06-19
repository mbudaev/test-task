package com.mbudaev.builders;

import com.mbudaev.domain.Client;

/**
 * Created by Миша on 19.06.2016.
 */
public class ClientBuilder {

    private Client client;

    public ClientBuilder() {
        this.client = new Client();
    }

    public ClientBuilder setName(String name) {
        this.client.setName(name);
        return this;
    }

    public ClientBuilder setPhone(String phone) {
        this.client.setPhone(phone);
        return this;
    }

    public Client build() {
        return this.client;
    }
}
