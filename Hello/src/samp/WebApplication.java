package samp;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class WebApplication {   
@Test   
public void testGoogleSearch() throws InterruptedException {
  // Optional. If not specified, WebDriver searches the PATH for chromedriver.
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\eeear\\OneDrive\\Desktop\\Java\\Hello\\driverpath\\chromedriver");
   WebDriver driver = new ChromeDriver();
  driver.get("http://www.google.com/"); 
  Thread.sleep(5000);  // Let the user actually see something!
  WebElement searchBox = driver.findElement(By.name("q"));
  searchBox.sendKeys("ChromeDriver");
  searchBox.submit(); 
  Thread.sleep(5000);  // Let the user actually see something!
  driver.quit();  
 }
}