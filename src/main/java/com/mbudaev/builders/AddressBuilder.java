package com.mbudaev.builders;

import com.mbudaev.domain.Address;

/**
 * Created by Миша on 19.06.2016.
 */
public class AddressBuilder {
    private Address address;

    public AddressBuilder() {
        this.address = new Address();
    }


    public AddressBuilder setCountry(String country) {
        this.address.setCountry(country);
        return this;
    }

    public AddressBuilder setState(String state) {
        this.address.setState(state);
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.address.setCity(city);
        return this;
    }

    public AddressBuilder setAddress(String address) {
        this.address.setAddress(address);
        return this;
    }

    public AddressBuilder setZipCode(int zipCode) {
        this.address.setZipCode(zipCode);
        return this;
    }

    public Address build() {
        return this.address;
    }

}
