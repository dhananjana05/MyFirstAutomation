import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = WebDriverManager.chromedriver().create();

        // Pause for setup (consider replacing with proper wait strategies)
        Thread.sleep(2000);

        // Maximize the browser window
        WebDriver.Window window = driver.manage().window();
        window.maximize();

        // Navigate to eBay
        driver.get("https://www.ebay.com/");

        // Select a category from the dropdown
        Select selectCategory = new Select(driver.findElement(By.id("gh-cat")));
        selectCategory.selectByVisibleText("Cell Phones & Accessories");

        // Search for an item (iPhone in this case)
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.clear();
        searchBox.sendKeys("iPhone");

        // Click the search button
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        // Wait for results to load (optional, replace with a proper wait condition)
        Thread.sleep(5000);

        // Select a specific item (Apple iPhone 11)
        driver.findElement(By.xpath("//span[text()='Apple iPhone 11']")).click();

        // Wait to observe the result (optional)
        Thread.sleep(10000);

        // Close the browser
        driver.quit();
    }
}







