import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = WebDriverManager.chromedriver().create();
        long millis = 2000;
        Thread.sleep(millis);

        // Maximize window
        WebDriver.Window window = driver.manage().window();
        window.fullscreen();

        // Navigate to eBay
        driver.get("https://www.ebay.com/");

        // Search for an item (iPhone in this case)
        driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Iphone");

        // Optionally, you could trigger the search (e.g., by clicking the search button)
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        //select option
        Select selectCategory = new Select(driver.findElement(By.id("gh-cat")));
        selectCategory.selectByVisibleText("Cell Phones & Accessories");
        
        //find option
        WebElement element = driver.findElement(By.cssSelector("gh-btn"));
        element.click();
    }
}





