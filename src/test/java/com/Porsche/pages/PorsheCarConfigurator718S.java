package com.Porsche.pages;

import com.Porsche.utulities.Driver;
import com.Porsche.utulities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PorsheCarConfigurator718S {


    public PorsheCarConfigurator718S(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='ccaPrice'])[5]")

    public WebElement basePrice718S;


    @FindBy(xpath = "(//div[@class='ccaPrice'])[6]")

    public WebElement priceForEquipment;

    @FindBy(xpath = "(//div[@class='ccaPrice'])[7]")

    public WebElement deliveryProcessingAndHandlingFee;

    @FindBy(id = "s_exterieur_x_FJ5")

    public WebElement selectMiamiBlue;



    @FindBy(xpath= "//div[@class='tt_price tt_cell']")

    public WebElement miamiBluePrice;



    @FindBy(xpath= "(//div[@class='tt_price tt_cell'])[2]")

    public WebElement whellPrice;




    @FindBy(xpath = "(//div[@class='ccaPrice'])[8]")

    public WebElement  totalPrice;

    @FindBy(id = "s_exterieur_x_M433")

    public WebElement  selectCarreraSportWheels;



    @FindBy(id = "s_interieur_x_74_x_PP04_x_shorttext")

    public WebElement movElement1;

    @FindBy(id = "s_interieur_x_PP06")

    public WebElement powerSportSeat;

    @FindBy(xpath = "//div[@id='seats_73']/div[2]/div[1]/div[3]/div")

    public WebElement pricePowerSportSeat ;



    @FindBy(id = "IAU_subHdl")

    public WebElement movElement2;


    @FindBy(id = "vs_table_IIC_x_PEKH_x_c01_PEKH")

    public WebElement interiorTrimInCarbonFiberSatandartInterior;

    @FindBy(xpath = "//div[@id='vs_table_IIC_x_PEKH']/div[1]/div[2]/div")

    public WebElement priceInteriorTrimInCarbonFiber;

    @FindBy(id = "IMG_subHdl")

    public WebElement performance ;

    @FindBy(id = "vs_table_IMG_x_M250_x_c11_M250")

    public WebElement PDK ;


    @FindBy(xpath = "//div[@id='vs_table_IMG_x_M250']/div[1]/div[2]/div")

    public WebElement priceOFPDK ;


    @FindBy(id = "vs_table_IMG_x_M658_x_c94_M658_x_shorttext")

    public WebElement movElement3;


    @FindBy(id = "vs_table_IMG_x_M450_x_c81_M450")
    public WebElement PCCB ;



    @FindBy(xpath = "//div[@id='vs_table_IMG_x_M450']/div[1]/div[2]/div")
    public WebElement pricePCCB ;




    @FindBy(id = "IIC_subHdl")
    public WebElement InteriorCarbonFiber;







}
