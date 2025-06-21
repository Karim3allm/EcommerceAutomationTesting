package com.LUMA.testcases;

import com.LUMA.Base.BaseTest;
import com.LUMA.Pages.PlaceOrder;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Login Test")
public class PlaceOrderTest extends BaseTest {

    @Story("Place order")
    @Description("Verify that user can select item from store and place order successfully")
    @Test (description = "Add items to cart and confirm order")

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
