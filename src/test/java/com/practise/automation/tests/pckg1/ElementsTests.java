package com.practise.automation.tests.pckg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest {


    @Test

    public void test1() {
        createAnAccount.click_sign_in();
        createAnAccount.enter_email();
        createAnAccount.click_create();
        createAnAccount.click_gender();
        createAnAccount.enter_firstName();
        createAnAccount.enter_lastName();
        createAnAccount.enter_mail();
        createAnAccount.enter_password();
        createAnAccount.click_day();
        createAnAccount.click_month();
        createAnAccount.click_year();
        createAnAccount.click_news();
        createAnAccount.click_offer();
        createAnAccount.enter_address();
        createAnAccount.enter_city();
        createAnAccount.click_state();
        createAnAccount.enter_postalCode();
        createAnAccount.enter_mobile();
        createAnAccount.enter_address2();
        createAnAccount.click_register();
    }

    @Test
    public void test2() {
        createAnAccount.click_sign_in();
        createAnAccount.enter_mail();
        createAnAccount.enter_password();
        endToEnd.click_loginSignIn();
        endToEnd.click_onwomen();
        endToEnd.click_ontops();
        endToEnd.click_ontshirts();
        endToEnd.click_ongrid();
        endToEnd.click_onaddtocart();
        endToEnd.click_continuetoshopping();
        endToEnd.click_on_dresses();
        endToEnd.click_quantity();
        endToEnd.select_size();
        endToEnd.click_AddtoCart();
        endToEnd.click_proceedToCheckout();
        endToEnd.click_delete();
        endToEnd.click_proceedToCheckout2();
        Assert.assertEquals(endToEnd.return_billingaddress(), "YOUR BILLING ADDRESS");
        Assert.assertEquals(endToEnd.return_LastName(), "Jovana Veljanoska");
        Assert.assertEquals(endToEnd.return_address1(), "Bul. Jane Sandanski");
        Assert.assertEquals(endToEnd.return_cityAndZip1(), "Skopje, Arizona 20000");
        Assert.assertEquals(endToEnd.return_state1(), "United States");
        Assert.assertEquals(endToEnd.return_phoneNumber1(), "078123456");
        endToEnd.click_proceedToCheckout3();
        endToEnd.click_agree();
        endToEnd.proceedToCheckout4();
        endToEnd.click_payment();
        endToEnd.click_confirm();
    }
}
