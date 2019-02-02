package com.Porsche.pages;

import com.Porsche.utulities.ConfigurationReader;
import com.Porsche.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='b-teaser-link'])[1]")

    public WebElement model718;



    public void open(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }





}
