package com.Porsche.pages;

import com.Porsche.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Model718Page {


public Model718Page(){

    PageFactory.initElements(Driver.getDriver(),this);
}



@FindBy(css="img[alt='Porsche 718 Cayman S']" )
    public WebElement model718S;

@FindBy(xpath ="(//div[@class='m-14-model-price'])[2]" )

    public WebElement priceofCaymanModelS;

}
