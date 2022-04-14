package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driver.BaseClass;
import methods.CommonMethods;

public class CommonPage_BAU_TC207 {
  
        public CommonPage_BAU_TC207() {
            PageFactory.initElements(BaseClass.getDriver(), this);
        }
        
        @FindBy(xpath = "//*[@id='page']/section/section/section[2]/div[1]/h1")
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
        
        
        @FindBy(xpath = "//*[@id='page']/section/section/div[2]/div[1]/div/h3")
        public WebElement errorMessagElement;
        
        @FindBy(xpath = "//*[@id='page']/section/section/div[2]/div[1]/ul/li[1]/div[1]/div/div[1]/h4/a")
        public WebElement adidasStorElement;
        
        @FindBy(xpath = "//*[@id='page']/section/div[2]/section[2]/div[3]/ul/li[1]/a")
        public WebElement hotDealShopNoWebElement;
        
        @FindBy(xpath = "//input[@type='email']")
        public WebElement hotDealEmailElement;
        
        @FindBy(xpath = "//*[@id='interstitial-form']/div[3]/div/button")
        public WebElement iWantDealElement;
       
        
        @FindBy(xpath = "//*[@id='interstitial-form']/div[3]/p[1]")
        public WebElement verifyHotDealEmailElement;
            
   
        
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
           // String bedBathText = bedBathDealInfoText.getText();
//            Assert.assertEquals(bedBathText, "Deals and Information");
//            System.out.println("Text : "+bedBathText);
//            
        }
        
        public void findAStoreErrorMsg() {
            findStoreElement.sendKeys(BaseClass.getProperty("IncorrectSpelling"));
            searcButtonElement.click();
            String errorMessageText = errorMessagElement.getText();
            Assert.assertEquals(errorMessageText, "We're sorry. No results were found.");
            System.out.println("Succeful on Search for "+errorMessageText);
            
        }
        
        public void findAdidasStore() {
            findStoreElement.sendKeys(BaseClass.getProperty("adidasStore"));
            searcButtonElement.click();
//            String adidas = adidasStorElement.getText();
//            Assert.assertEquals(adidas, "Adidas");
//            System.out.println("Succeful on Search for "+adidas);
            
        }
        
        public void clickOnAdidasStore() {
            adidasStorElement.click();
        }
        
        public void clickHotDealShopNow() {
            CommonMethods.jsClick(hotDealShopNoWebElement);
        }
        
        public void inputEmail() {
            hotDealEmailElement.sendKeys(BaseClass.getProperty("hotDealEmail"));
            CommonMethods.jsClick(iWantDealElement);
        }
        
        public void veryAdidasPage(){
            
        }
       
        
        
        
        
        
}
