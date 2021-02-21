package com.test.selenium.test;

import com.test.selenium.base.BaseTest;
import com.test.selenium.pagemodel.PageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class PageModelTest extends BaseTest {

    PageModel pageModel;
    String pagepriceString;

    @Step({"Siteye Giriş Yaptık"})
    public void before() {
        pageModel = new PageModel(getWebDriver());
    }

    @Step({"Ürüne Tıkla"})
    public void elementClick (){
        pageModel.elementClick();
    }

    @Step("4.ürüne tıklanır")
    public void clickproduct() {
        pageModel.clickProduct();
    }

    @Step({"Sepetteki ürün 2 olarak girilir ve kontrol edilir"})
    public void IncreaseProductQuantity() {
        pageModel.chartIncreaseQuantityClick();
    }

    @Step({"Ana sayfanın açıldığı kontrol edilir"})
    public void CheckMainPageIsVisible (){
        boolean visibilityStatus = pageModel.GetMainPageVisibility();
        Assert.assertTrue("Ana sayfa acilamadi.",visibilityStatus );
    }

    @Step({"Hesabımın üstüne gelir"})
    public void hoverElement (){
        pageModel.hoverElement();
    }

    @Step({"Giriş yap"})
    public void clickLogin (){
        pageModel.loginClick();
    }

    @Step({"Email <email> bilgilerini giriyoruz"})
    public void enterEmail (String email){
        pageModel.enterEmail(email);
    }

    @Step({"Şifre <password> giriyoruz"})
    public void enterPassword (String password){
        pageModel.enterPassword(password);
    }

    @Step({"Giriş yap tuşuna basılır"})
    public void clickLoginEnter (){
        pageModel.clickLoginEnter();
    }

    @Step({"Arayama <text> yazıldı"})
    public void searchEnterText(String text) {
        pageModel.searchEnterText(text);
    }

    @Step({"Arama icona tıklandı"})
    public void clickSearch (){
        pageModel.searchClick();
    }

    @Step({"2. sayfa açılır"})
    public void clickSecondPageButton (){
        pageModel.searchPageNo();
    }

    @Step({"Cookie kapatılır"})
    public void clickCookieClose (){
        pageModel.clickCookieClose();
    }

    @Step("Sepete eklenir")
    public void clickrecophone() {
        pagepriceString = pageModel.getTextPage();
        pageModel.clickrecophone();

    }

    @Step("Sepete gidilir")
    public void implementation1() {
        pageModel.goBasket();
    }

    @Step("Sayfadaki fiyatıyla sepet fiyatı karşılaştırılır")
    public void basketCheck() {
        String onBasket = pageModel.getTextBasket();
        Assert.assertEquals(onBasket, pagepriceString);
    }

    @Step("Sepetten sil")
    public void implementation2() {
        pageModel.clickDelete();
    }

}
