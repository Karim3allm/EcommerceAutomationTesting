package com.LUMA.Pages;

import com.LUMA.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PromoCode extends BasePage {
    public PromoCode(WebDriver driver) {
        super(driver);
    }

    public PromoCode PromoCode ()
    {

             //Edit and review button
            driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]")).click();



            //Add promo code
             driver.findElement(By.xpath("//*[@id=\"block-discount\"]/div[1]")).click();
             driver.findElement(By.name("coupon_code")).sendKeys("A123Btc");
             driver.findElement(By.xpath("//*[@id=\"discount-coupon-form\"]/div/div[2]/div")).click();

             return this;
}

}
