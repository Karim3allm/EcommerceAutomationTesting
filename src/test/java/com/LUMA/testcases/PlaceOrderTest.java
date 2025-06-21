package com.LUMA.testcases;

import com.LUMA.Base.BaseTest;
import com.LUMA.Pages.PlaceOrder;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Login Test")
public class PlaceOrderTest extends BaseTest {

    @Story("")
    @Description("")
    @Test (description = "")

    public void PlaceOrder()
              {
        PlaceOrder placeOrder = new PlaceOrder(driver);
        placeOrder.
                 OpenWebsite()
                .SelectProduct()
                .SelectColorAndSize()
                .AddToCart()
                .ProceedToCheckout()
                .ShippingAddress()
                .CompletePurchase();
    }

}
