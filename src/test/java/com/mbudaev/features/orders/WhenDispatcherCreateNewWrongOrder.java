package com.mbudaev.features.orders;

import com.mbudaev.builders.AddressBuilder;
import com.mbudaev.builders.ClientBuilder;
import com.mbudaev.builders.OrderBuilder;
import com.mbudaev.domain.Address;
import com.mbudaev.domain.Client;
import com.mbudaev.domain.Order;
import com.mbudaev.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Миша on 18.06.2016.
 */
@RunWith(SerenityRunner.class)
public class WhenDispatcherCreateNewWrongOrder extends BaseTest {

    private Address address = new AddressBuilder()
            .setCountry("")
            .setState("")
            .setCity("")
            .setAddress("")
            .setZipCode(12345)
            .build();
    private Client client = new ClientBuilder()
            .setName("")
            .setPhone("")
            .build();
    private Order order = new OrderBuilder()
            .setDeliveryDate("")
            .setDeliveryShift("")
            .setorderNumber(1)
            .setOrderType("")
            .setVolume(10.2)
            .setUnitsQuntity("")
            .setUnitsType("")
            .setDeliveryMode("")
            .setDestinationAddress(address)
            .setClientInfo(client).build();

    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.loginAsDispatcher();
        userSteps.onDispatcherPage.clickButtonNewOrder();
    }

    @Test
    public void dispatcherCreateWrongOrder() {
        userSteps.onOrderPage.fillOrderForm(order);

    }
}
