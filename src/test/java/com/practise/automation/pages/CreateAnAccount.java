package com.practise.automation.pages;

import com.practise.automation.tests.pckg1.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class CreateAnAccount {

    public WebDriver driver;
    public WebDriverWait wait;
    Random rand = new Random();
    int rand_int= rand.nextInt(10000);

    public CreateAnAccount(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By email = By.xpath("//*[@id=\"email_create\"]");
    By clickCreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    By clickGender = By.xpath("//*[@id=\"id_gender2\"]");
    By firstName = By.xpath("//*[@id=\"customer_firstname\"]");
    By lastName = By.xpath("//*[@id=\"customer_lastname\"]");
    By mail = By.xpath("//*[@id=\"email\"]");
    By password = By.xpath("//*[@id=\"passwd\"]");
    By day = By.xpath("//*[@id=\"days\"]/option[20]");
    By month = By.xpath("//*[@id=\"months\"]/option[2]");
    By year = By.xpath("//*[@id=\"years\"]/option[30]");
    By news = By.xpath("//*[@id=\"uniform-newsletter\"]/span");
    By offer = By.xpath("//*[@id=\"uniform-optin\"]/span");
    By address = By.xpath("//*[@id=\"address1\"]");
    By city = By.xpath("//*[@id=\"city\"]");
    By state = By.xpath("//*[@id=\"id_state\"]/option[4]");
    By postalcode = By.xpath("//*[@id=\"postcode\"]");
    By mobile = By.xpath("//*[@id=\"phone_mobile\"]");
    By address2 = By.xpath("//*[@id=\"alias\"]");
    By register = By.xpath("//*[@id=\"submitAccount\"]/span");


    public void click_register() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(register)).click();
    }

    public void enter_address2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address2)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(address2)).sendKeys("Jane Sandanski");
    }

    public void enter_mobile() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobile)).sendKeys("078123456");
    }

    public void enter_postalCode() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalcode)).sendKeys("20000");
    }

    public void click_state() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(state)).click();
    }

    public void enter_city() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys("Skopje");
    }

    public void enter_address() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address)).sendKeys("Bul. Jane Sandanski");
    }

    public void click_offer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(offer)).click();
    }

    public void scroll () {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void click_news() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(news)).click();
    }

    public void click_year() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(year)).click();
    }

    public void click_month() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(month)).click();
    }

    public void click_day() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(day)).click();
    }

    public void enter_password() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("majmunce");
    }

    public void enter_mail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mail)).sendKeys(Keys.CONTROL + "A");
        wait.until(ExpectedConditions.visibilityOfElementLocated(mail)).sendKeys( "jovana_mi@hotmail.com");
    }

    public void enter_lastName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys("Veljanoska");
    }

    public void enter_firstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Jovana");
    }

    public void click_gender() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickGender)).click();
    }

    public void click_sign_in() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    public void enter_email() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("jovana_mi" + rand_int + "@hotmail.com");
    }

    public void click_create() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreate)).click();
    }


}
