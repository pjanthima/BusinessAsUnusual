package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driver.BaseClass;

public class CommonPage_BAU_TC207 {
  
        public CommonPage_BAU_TC207() {
            PageFactory.initElements(BaseClass.getDriver(), this);
        }
        
        @FindBy(xpath = "//*[@id=\"page\"]/section/section/section[2]/div[1]/h1")
        public WebElement allStoreText;
        
        @FindBy(xpath = "//a[@href='/stores-a-z?hsh=2']")
        public WebElement storeMenuElement;
        
        @FindBy(xpath = "//*[@id='page']/section/section/section[2]/section/div/div/input")
        public WebElement findStoreElement;
        
        
        @FindBy(xpath = "//*[@id='page']/section/section/section[2]/section/div/div/button/img")
        public WebElement searcButtonElement;
        
        @FindBy(xpath ="//*[@id='page']/section/div[2]/section[2]/div[1]/h2/span[1]")
        public WebElement bedBathDealInfoText;
        
        @FindBy(xpath = "//*[@id='page']/section/section/div[2]/div[1]/ul/li[1]/div[1]/div/div[1]/h4/a")
        public WebElement bedBathTextElement;
        
        public void verifyHomePage() {
            String expectedTitle = BaseClass.getProperty("homePagetitle");
            String actualTitle = BaseClass.getDriver().getTitle();
            if(actualTitle.equalsIgnoreCase(expectedTitle))
                System.out.println("Title Matched, You're on HomePage");
            else
                System.out.println("Title didn't match : "+actualTitle);
        }
        
        public void verifyStorePage() {  
            String allStroreTagString = allStoreText.getText();
            Assert.assertEquals(allStroreTagString, "All Stores");
            System.out.println("All Stores");
        }
        
        public void findAStore() {
            findStoreElement.sendKeys(BaseClass.getProperty("findStore"));
            searcButtonElement.click();
            String bedBath = bedBathTextElement.getText();
            Assert.assertEquals(bedBath, "Bed Bath & Beyond");
            System.out.println("Succeful on Search for "+bedBath);
            
        }
        
        public void clickOnBedBath() {
            bedBathTextElement.click();
            String bedBathText = bedBathDealInfoText.getText();
            Assert.assertEquals(bedBathText, "Deals and Information");
            System.out.println("Text : "+bedBathText);
            
        }
        
        
        
}
