package com.LUMA.Pages;

import com.LUMA.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAndEditOrder extends BasePage {
    public DeleteAndEditOrder(WebDriver driver) {
        super(driver);
    }

    public DeleteAndEditOrder ViewAndEditCart()
    {
        //Edit and review button
        driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]")).click();

        //delete button
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")).click();
        return this;
    }





}
