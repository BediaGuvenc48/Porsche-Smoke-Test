package com.Porsche.utulities;

import com.Porsche.pages.HomePage;
import com.Porsche.pages.Model718Page;
import com.Porsche.pages.PorsheCarConfigurator718S;

public class Pages {


    public HomePage homePage;
    public Model718Page model718Page;
    public PorsheCarConfigurator718S porsheCarConfigurator718S;


    public Pages(){


        homePage= new HomePage();
        model718Page= new Model718Page();
        porsheCarConfigurator718S= new PorsheCarConfigurator718S();
    }



}
