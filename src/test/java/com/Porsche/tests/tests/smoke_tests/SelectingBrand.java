package com.Porsche.tests.tests.smoke_tests;

import com.Porsche.utulities.BrowserUtilities;
import com.Porsche.utulities.ConfigurationReader;
import com.Porsche.utulities.Driver;
import com.Porsche.utulities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class SelectingBrand extends TestBase {

@Test
    public void selecting718(){

    pages.homePage.open();
        pages.homePage.model718.click();
        //4. Remember the price of 718 Cayman Model S
    String priceHomePage718S= pages.model718Page.priceofCaymanModelS.getText();

    int start= priceHomePage718S.indexOf("$")+2;
    int end=priceHomePage718S.indexOf('*');
    priceHomePage718S=priceHomePage718S.substring(start,end);
    priceHomePage718S=priceHomePage718S.replace(",","");
    double priceHomepage718S= Double.parseDouble(priceHomePage718S);
        //5. Click on 718 Cayman S
        pages.model718Page.model718S.click();
        BrowserUtilities.switchToWindow("Porsche Car Configurator");
//6. Verify that Base price displayed on the page is same as
    // the price from step 4

    Assert.assertEquals(priceHomepage718S,BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S));

    //7. Verify that Price for Equipment is 0
    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment),0.0);
    //8. Verify that total price is the sum of base price + Delivery, Processing and Handling Fee
    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S)+

            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment));

    //9. Select color “Miami Blue”

    pages.porsheCarConfigurator718S.selectMiamiBlue.click();



    //10.Verify that Price for Equipment is Equal to Miami Blue price
    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment), BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.miamiBluePrice));
    //11.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing
    //and Handling Fee

    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S)+

            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment) );
    //12.Select 20" Carrera Sport Wheels


    BrowserUtilities.waitForClickablility( pages.porsheCarConfigurator718S.selectCarreraSportWheels);
    pages.porsheCarConfigurator718S.selectCarreraSportWheels.click();

    //13.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels

Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.miamiBluePrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.whellPrice));

///14.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing
//        //and Handling Fee


    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice), BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+
            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S));

    //15.Select seats ‘Power Sport Seats (14-way) with Memory Package’

BrowserUtilities.movelement(pages.porsheCarConfigurator718S.movElement1);
pages.porsheCarConfigurator718S.powerSportSeat.click();
//16.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels
    //+ Power Sport Seats (14-way) with Memory Package

    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.miamiBluePrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.pricePowerSportSeat)+
            +BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.whellPrice));

    //17.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing
    //and Handling Fee
    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S)+

            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment) );

    //18.Click on Interior Carbon Fiber

    BrowserUtilities.movelement(pages.porsheCarConfigurator718S.movElement2);

    pages.porsheCarConfigurator718S.InteriorCarbonFiber.click();
    BrowserUtilities.waitForClickablility(pages.porsheCarConfigurator718S.priceInteriorTrimInCarbonFiber);

    //19.Select Interior Trim in Carbon Fiber i.c.w. Standard Interior


            pages.porsheCarConfigurator718S.interiorTrimInCarbonFiberSatandartInterior.click();
    actions.sendKeys(Keys.ARROW_DOWN).perform();
//20.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels
    //+ Power Sport Seats (14-way) with Memory Package + Interior Trim in Carbon Fiber i.c.w.
    //Standard Interior
    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.miamiBluePrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.pricePowerSportSeat)+
            +BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.whellPrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceInteriorTrimInCarbonFiber));

    //21.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing
    //and Handling Fee

    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S)+

            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment) );

    //22.Click on Performance

    pages.porsheCarConfigurator718S.performance.click();
    //23.Select 7-speed Porsche Doppelkupplung (PDK)
    pages.porsheCarConfigurator718S.PDK.click();

    BrowserUtilities.movelement(pages.porsheCarConfigurator718S.movElement3);
    //24.Select Porsche Ceramic Composite Brakes (PCCB)
    pages.porsheCarConfigurator718S.PCCB.click();

    //25.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels
    //+ Power Sport Seats (14-way) with Memory Package + Interior Trim in Carbon Fiber i.c.w.
    //Standard Interior + 7-speed Porsche Doppelkupplung (PDK) + Porsche Ceramic Composite
    //Brakes (PCCB)

    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.miamiBluePrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.pricePowerSportSeat)+
            +BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.whellPrice)+BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceInteriorTrimInCarbonFiber)+
            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceOFPDK)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.pricePCCB));

    //26.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing
    //and Handling Fee

    Assert.assertEquals(BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.totalPrice),BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.basePrice718S)+

            BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.deliveryProcessingAndHandlingFee)+ BrowserUtilities.convertDouble(pages.porsheCarConfigurator718S.priceForEquipment) );

    }






}
