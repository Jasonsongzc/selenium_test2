package automationFrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBaidu {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("今天天气");
        driver.findElement(By.id("su")).click();
        driver.quit();
    }

}
