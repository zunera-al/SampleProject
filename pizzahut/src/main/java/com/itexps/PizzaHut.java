/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Zunera Ali
 */
public class PizzaHut {

    WebDriver driver;

    public PizzaHut(WebDriver driver) {
        this.driver = driver;

    }
    @FindBy(xpath = ".//*[@name='q']")
    private WebElement search;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/h3/a")
    private WebElement deals;
    @FindBy(xpath = "//*[@id=\"tile-5-n-up-lineupbr2-or-more-starting-at-5-each\"]/div/div[2]/div[3]/div[2]/div[1]/div/a[1]")
    private WebElement ordernow;
    @FindBy(xpath = "//*[@id=\"ph-localization-id\"]/div[1]/div[1]/div/div/label/span[1]")
    private WebElement delivery;

    @FindBy(xpath = "//*[@id=\"syo-address1\"]")
    private WebElement myaddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement mycity;

    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement mystate;
    @FindBy(xpath = "//*[@id=\"zip-input\"]")
    private WebElement myzip;
    @FindBy(xpath = "//*[@id=\"ph-find-store\"]")
    private WebElement findstore;

    @FindBy(xpath = "//*[@id=\"ph-localization-id\"]/div[1]/div[2]/div/label/span[1]")
    private WebElement carryout;
    @FindBy(xpath = "//*[@id=\"zip-input\"]")
    private WebElement location;

    public void searchFor(String address, String city, String state, String zip, String zipcode)
            throws Exception {
        try {

            driver.get("http://pizzahut.com");

            deals.click();
            ordernow.click();
            delivery.click();

            myaddress.sendKeys(address);
            mycity.sendKeys(city);
            mystate.sendKeys(state);
            myzip.sendKeys(zip);
            findstore.click();
            carryout.click();
            location.sendKeys(zipcode);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
