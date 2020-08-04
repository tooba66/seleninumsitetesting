import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udacitysignup {
    WebDriver driver = new ChromeDriver();
    @Test
    public void udacitypasscase()
    {
        driver.navigate().to("https://auth.udacity.com/sign-up?next=https://classroom.udacity.com/authenticated");



        WebElement fn = driver.findElement(By.id("first-name"));
        String js3 = "arguments[0].setAttribute('value','"+"tooba"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, fn);

        WebElement ln = driver.findElement(By.id("last-name"));
        String lss = "arguments[0].setAttribute('value','"+"batool"+"')";
        ((JavascriptExecutor) driver).executeScript(lss, ln);

        WebElement emils = driver.findElement(By.id("email"));
        String emls = "arguments[0].setAttribute('value','"+"toobabatool@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(emls, emils);

        WebElement pass = driver.findElement(By.id("revealable-password"));
        String psss = "arguments[0].setAttribute('value','"+"bvfhvsnv"+"')";
        ((JavascriptExecutor) driver).executeScript(psss, pass);

        WebElement signup = driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
        JavascriptExecutor signups = (JavascriptExecutor)driver;
        signups.executeScript("arguments[0].click();", signup);

    }
    @Test
    public void udacityfailcase()
    {
        driver.navigate().to("https://auth.udacity.com/sign-up?next=https://classroom.udacity.com/authenticated");



        WebElement fn = driver.findElement(By.id("first-name"));
        String js3 = "arguments[0].setAttribute('value','"+"tooba"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, fn);

        WebElement ln = driver.findElement(By.id("last-name"));
        String lss = "arguments[0].setAttribute('value','"+"batool"+"')";
        ((JavascriptExecutor) driver).executeScript(lss, ln);

        WebElement emils = driver.findElement(By.id("email"));
        String emls = "arguments[0].setAttribute('value','"+"toobabatool@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(emls, emils);

        WebElement pass = driver.findElement(By.id("revealable-password"));
        String psss = "arguments[0].setAttribute('value','"+"bvfhvsnv"+"')";
        ((JavascriptExecutor) driver).executeScript(psss, pass);

        WebElement signup = driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
        JavascriptExecutor signups = (JavascriptExecutor)driver;
        signups.executeScript("arguments[0].click();", signup);

    }


}
