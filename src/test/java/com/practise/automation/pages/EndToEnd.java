package com.practise.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEnd {

    public WebDriver driver;
    public WebDriverWait wait;

    public EndToEnd(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    By loginSignIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    By clickonwomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By clickontops = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
    By clickontshirts = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img");
    By clickonquantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span");
    By clickonaddtocart = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]/span");
    By clickOnGrid = By.xpath("//*[@id=\"list\"]/a/i");
    By continueToShopping = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
    By clickOnDresses = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]/span");
    By selectSize = By.xpath("//*[@id=\"group_1\"]/option[2]");
    By clickAddToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By proceedToCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    By clickDelete = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a");

    By proceedToCheckout2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    By proceedToCheckout3 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    By agree = By.xpath("//*[@id=\"uniform-cgv\"]/span");
    By proceedToCheckout4 = By.xpath("//*[@id=\"form\"]/p/button");
    By payment = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a");
    By clickConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button");

    By returnBillingAddress = By.xpath("//*[@id=\"address_invoice\"]/li[1]/h3");
    By returnLastName = By.xpath("//*[@id=\"address_invoice\"]/li[2]");
    By returnAddress1 = By.xpath("//*[@id=\"address_invoice\"]/li[3]");
    By returnCityAndZip1 = By.xpath("//*[@id=\"address_invoice\"]/li[4]");
    By returnState1 = By.xpath("//*[@id=\"address_invoice\"]/li[5]");
    By returnPhoneNumber1 = By.xpath("//*[@id=\"address_invoice\"]/li[6]");


    public String return_phoneNumber1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnPhoneNumber1)).getText();
    }

    public String return_state1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnState1)).getText();
    }

    public String return_cityAndZip1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnCityAndZip1)).getText();
    }

    public String return_address1() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnAddress1)).getText();
    }

    public String return_billingaddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnBillingAddress)).getText();
    }

    public String return_LastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnLastName)).getText();
    }

    public void click_confirm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickConfirm)).click();
    }

    public void proceedToCheckout4() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout4)).click();
    }

    public void click_delete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDelete)).click();
    }

    public void click_AddtoCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCart)).click();
    }

    public void select_size() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectSize)).click();
    }

    public void click_on_dresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnDresses)).click();
    }

    public void click_continuetoshopping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueToShopping)).click();
    }

    public void click_payment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(payment)).click();
    }

    public void click_agree() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agree)).click();
    }

    public void click_proceedToCheckout3() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout3)).click();
    }

    public void click_proceedToCheckout2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout2)).click();
    }

    public void click_proceedToCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout)).click();
    }

    public void click_onaddtocart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonaddtocart)).click();
    }

    public void click_quantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonquantity)).click();
    }

    public void click_ontshirts() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickontshirts)).click();
    }

    public void click_ontops() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickontops)).click();
    }

    public void click_onwomen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonwomen)).click();
    }

    public void click_loginSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginSignIn)).click();
    }

    public void click_ongrid() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnGrid)).click();
    }


}