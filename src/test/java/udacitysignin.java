import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udacitysignin {

    WebDriver driver = new ChromeDriver();


    @Test
    public void udacitysignin(){
        driver.navigate().to("https://auth.udacity.com/sign-in?next=https://classroom.udacity.com/authenticated");




        WebElement emils = driver.findElement(By.id("email"));
        String emls = "arguments[0].setAttribute('value','"+"toobabatool@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(emls, emils);

        WebElement pass = driver.findElement(By.id("revealable-password"));
        String psss = "arguments[0].setAttribute('value','"+"bvfhvsnv"+"')";
        ((JavascriptExecutor) driver).executeScript(psss, pass);

        WebElement signin = driver.findElement(By.xpath("//button[contains(.,'Sign In')]"));
        JavascriptExecutor signups = (JavascriptExecutor)driver;
        signups.executeScript("arguments[0].click();", signin);







    }
    @Test
    public void udacityfailcase(){
        driver.navigate().to("https://auth.udacity.com/sign-in?next=https://classroom.udacity.com/authenticated");




        WebElement emils = driver.findElement(By.id("email"));
        String emls = "arguments[0].setAttribute('value','"+"toobabatogmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(emls, emils);

        WebElement pass = driver.findElement(By.id("revealable-password"));
        String psss = "arguments[0].setAttribute('value','"+"bvfhvsnv"+"')";
        ((JavascriptExecutor) driver).executeScript(psss, pass);

        WebElement signin = driver.findElement(By.xpath("//button[contains(.,'Sign In')]"));
        JavascriptExecutor signups = (JavascriptExecutor)driver;
        signups.executeScript("arguments[0].click();", signin);


    }
}
