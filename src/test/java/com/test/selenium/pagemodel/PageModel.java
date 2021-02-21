package com.test.selenium.pagemodel;

import com.test.selenium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.test.selenium.constants.Constants.*;

public class PageModel extends BasePage {

    public PageModel(WebDriver driver) {
        super(driver);
    }

    public void elementClick() {
        click(CLICK_ELEMENT);
    }

    public void chartIncreaseQuantityClick() {
        click(PRODUCT_QUANTITY);
        click(PRODUCT_QUANTITY_VALUE);
    }

    public void clickProduct() {
        click(PRODUCT_PATH);
    }

    public void loginClick()
    {
        click(LOGIN_BUTTON);
    }

    public void hoverElement(){
        hoverElement(ACCOUNT_OVER);
    }

    public boolean GetMainPageVisibility(){
        return isVisible(IMG_ALT);
    }

    public void enterEmail(String email){
        sendKeys(LOGIN_EMAIL,email);
    }

    public void enterPassword(String password){
        sendKeys(LOGIN_PASSWORD,password);
    }

    public void clickLoginEnter(){
        click(LOGIN_ENTER);
    }

    public void searchEnterText(String searchText){
        sendKeys(INPUT,searchText);
    }

    public void searchClick(){
        click(SEARCH);
    }

    public void searchPageNo(){
        click(PAGE_NO);
    }

    public void clickCookieClose() {
        click(COOKIE_CLOSE);
    }

    public void clickrecophone(){
        click(RECOPHONE);
    }

    public String getTextPage(){
        return getText(PRICE_ONPAGE);
    }

    public void goBasket(){
        hoverElement(BASKETHOVER);
        click(BASKET);
    }

    public void clickDelete(){
        click(DELETE);
    }
    
    public String getTextBasket(){
        return getText(PRICE_ONBASKET);
    }

}
