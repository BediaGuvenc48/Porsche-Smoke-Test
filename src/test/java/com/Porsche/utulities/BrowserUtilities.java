package com.Porsche.utulities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserUtilities {


    /**
     * Generates the String path to the screenshot taken.
     * Within the method, the screenshot is taken and is saved into FileUtils.
     * The String return will have a unique name destination of the screenshot itself.
     *
     * @param name Test name passed in as a String
     * @return unique String representation of the file's location / path to file
     */


    public static String getScreenshot(String name){

        String time= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());


        //Take a ScreeenShot which is interface from Selenium which takes ScreenShot

        TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
        File source= takesScreenshot.getScreenshotAs(OutputType.FILE);

        String target= System.getProperty("user.dir")+"/test-output/Screenshots"+name+time+".png";
        File finalDestination= new File(target);


        try {
            FileUtils.copyFile(source,finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }

return target;
    }

    /*
     * switches to new window by the exact title
     * returns to original window if windows with given title not found
     */

    public static void switchToWindow(String targetTitle){

        String origin= Driver.getDriver().getWindowHandle();

        for(String handle: Driver.getDriver().getWindowHandles()){

            Driver.getDriver().switchTo().window(handle);

            if (Driver.getDriver().getTitle().equals(targetTitle)){

                return;
            }
        }

        Driver.getDriver().switchTo().window(origin);


    }

    public static double convertDouble(WebElement element){

        String price= element.getText().replace("$", "").replace(",", "");

        return Double.valueOf(price);
    }



    public static void waitForClickablility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void movelement(WebElement element) {
       Actions actions= new Actions(Driver.getDriver());
       actions.moveToElement(element).perform();
    }







}
