package com.LUMA.Pages;

import com.LUMA.Base.BasePage;
import com.LUMA.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrder extends BasePage {

    public PlaceOrder(WebDriver driver)
    {
        super(driver);
    }


    @Step("going the  page")
    public PlaceOrder OpenWebsite()
    {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }




    public PlaceOrder SelectProduct()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.className("product-image-photo"))).perform();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div")).click();

        return this;
    }


    public PlaceOrder SelectColorAndSize()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("option-label-size-143-item-166")).click();
        driver.findElement(By.id("option-label-color-93-item-50")).click();

        return this;
    }

    public PlaceOrder AddToCart()

    {
        //click on add carts then click on basket
        driver.findElement(By.id("product-addtocart-button")).click();
        WebElement successMsg = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")));
        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
        checkoutButton.click();
        return this;
    }


    public PlaceOrder ProceedToCheckout()
    {
        driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
        return this;
    }



    public PlaceOrder ShippingAddress()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.name("firstname")).sendKeys("Ahmed");
        driver.findElement(By.name("lastname")).sendKeys("Ali");
        driver.findElement(By.name("street[0]")).sendKeys("Maddi");
        driver.findElement(By.name("city")).sendKeys("Cairo");

        Select CourseDropDown = new Select(driver.findElement(By.name("region_id")));
        CourseDropDown.selectByIndex(3);

        driver.findElement(By.name("postcode")).sendKeys("123456");
        driver.findElement(By.name("telephone")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")).click();
        driver.findElement(By.id("customer-email")).sendKeys("dummy@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div")).click();

        return this;
    }

    public void CompletePurchase()
    {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

    }














}
