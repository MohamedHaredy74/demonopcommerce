package currenciesTests;

import baseTests.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Currency extends BaseTest{

    @Test
    public void testIfCurrencyChangedOverAllProducts()
    {
        //select Euro from currency dropDownList[Euro , US Dollar]
        homePage.selectCurrency("Euro");
      List<String>currencyText= homePage.getCurrenciesOfProducts();
        SoftAssert softAssert=new SoftAssert();
      for (String  t :currencyText)
      {
          softAssert.assertTrue(t.contains("€"));
          softAssert.assertAll();
          System.out.println(t);
      }
    }


}
