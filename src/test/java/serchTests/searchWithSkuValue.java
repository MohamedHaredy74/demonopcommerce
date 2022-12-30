package serchTests;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchWithSkuValue extends BaseTest {



    private String SkuKeyword="SCI_FAITH";//APPLE_CAM or SF_PRO_11 or SCI_FAITH
    @Test
    public void searchWithSkuValue()
    {
        homePage.setSearchField(SkuKeyword);
        homePage.clickSearchButton();
        homePage.clickOnPicture();
        Assert.assertTrue(homePage.getSkuValue().contains(SkuKeyword));
        System.out.println(homePage.getSkuValue());

    }




}
