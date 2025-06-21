package com.LUMA.testcases;

import com.LUMA.Base.BaseTest;
import com.LUMA.Pages.PlaceOrder;
import com.LUMA.Pages.PromoCode;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class PromoCodeTest extends BaseTest {


    @Story("Apply promo code")
    @Description("Check user can apply promo code")
    @Test(description = "Get promo code discount")
    public void PromoCode()

    {
        PlaceOrder placeOrder = new PlaceOrder(driver);
        placeOrder.
                OpenWebsite()
                .SelectProduct()
                .SelectColorAndSize()
                .AddToCart();

        PromoCode promoCode = new PromoCode(driver);
        promoCode.PromoCode();

    }




}
