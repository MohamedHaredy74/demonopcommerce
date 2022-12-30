package serchTests;

import baseTests.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class searchResultValidation  extends BaseTest {
    private String searchKeyword="laptop";
    @Test
    public void searchAndValidateResults()
    {
        homePage.setSearchField(searchKeyword);
        homePage.clickSearchButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homePage.getCurrentURL().contains(searchKeyword),"SearchKeyword Not Found");

       for(String title :homePage.getProductsTextOfSearchResult())
       {
           System.out.println(title);
           softAssert.assertTrue(title.contains(searchKeyword));
       }
       softAssert.assertAll();
    }




}
