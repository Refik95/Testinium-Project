package com.test.selenium.constants;

import org.openqa.selenium.By;

public class Constants {

    public static String WEBLINK = "https://www.gittigidiyor.com/";
    public static final By ACCOUNT_OVER = By.xpath("//*[contains(@class, 'gekhq4-4')]");
    public static final By IMG_ALT = By.xpath("//img[@alt='GittiGidiyor']");
    public static final By LOGIN_BUTTON = By.xpath("//span[contains(text(), 'Giriş Yap')]");
    public static final By LOGIN_EMAIL = By.id("L-UserNameField");
    public static final By LOGIN_PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By INPUT = By.xpath("//*[contains(@data-cy,'header-search-input')]");
    public static final By SEARCH = By.xpath("//*[contains(@data-cy,'search-find-button')]");
    public static final By PRODUCT_PATH = By.xpath("//*[@id='item-info-block-649244446']/div/div[1]/div[1]/h3/span");
    public static final By PAGE_NO = By.xpath("//ul[@class='clearfix']/li/a[text()='2']");
    public static final By PRODUCT_QUANTITY = By.xpath("//div[contains(@class,'gg-input-select')]/select[@class='amount']");
    public static final By PRODUCT_QUANTITY_VALUE = By.xpath("//div/select/option[@value='2']");
    public static final By COOKIE_CLOSE = By.xpath("//*[contains(@class,'policy-alert-close')]");
    public static final By RECOPHONE = By.id("add-to-basket");
    public static final By PRICE_ONPAGE = By.id("sp-price-lowPrice");
    public static final By PRICE_ONBASKET = By.className("new-price");
    public static final By BASKET = By.cssSelector(".gg-ui-btn-default.padding-none");
    public static final By BASKETHOVER = By.className("robot-header-iconContainer-cart");
    public static final By DELETE = By.cssSelector(".btn-delete.hidden-m");
    public static final By CLICK_ELEMENT=By.cssSelector("#item-info-block-509831875 p img");

}
