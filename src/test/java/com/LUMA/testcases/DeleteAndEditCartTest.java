package com.LUMA.testcases;

import com.LUMA.Base.BaseTest;
import com.LUMA.Pages.DeleteAndEditOrder;
import com.LUMA.Pages.PlaceOrder;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class DeleteAndEditCartTest extends BaseTest {



    @Story("Delete and view products in cart")
    @Description("Verify that user can delete the cart and view it")
    @Test (description = "Delete items in cart after adding it")

    public void DeleteAndEditCart()
    {

        PlaceOrder placeOrder = new PlaceOrder(driver);
        placeOrder.OpenWebsite().SelectProduct()
        .SelectColorAndSize().AddToCart();


        DeleteAndEditOrder DeleteAndEditOrder = new DeleteAndEditOrder(driver);
        DeleteAndEditOrder.ViewAndEditCart();

    }


}
