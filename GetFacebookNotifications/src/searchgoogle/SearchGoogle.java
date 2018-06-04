
package searchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchGoogle {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();      
        
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));
        
        
        email.sendKeys("0984742593");
        password.sendKeys("new  password  ");
        login.submit();
        
        //get number of notifications
        WebElement numberOfNotifictions = driver.findElement(By.id("notificationsCountValue"));
        String count = numberOfNotifictions.getText();
        System.out.println("You have got " + count + " notifications.");
        
        
        //http://www.afreesms.com/intl/ethiopia
        //phone: ae1c8b6263cf71e2edbfa0bfe7800677
        //message: 67569735e63bfc5f67220efacdd40ee3
        //verification code entry: 229daf4b94961b650dad48df5b5ce2c0
        
        
        
        
        
 
    }
    
}
