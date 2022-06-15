package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boomf {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ArrayList<File> nizSlika = new ArrayList<>();
        nizSlika.add(new File("src/main/resources/Front.jpg"));
        nizSlika.add(new File("src/main/resources/Left.jpg"));
        nizSlika.add(new File("src/main/resources/Right.jpg"));
        nizSlika.add(new File("src/main/resources/Back.jpg"));

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to(url);
        driver.manage().window().maximize();


        for (int i = 0; i < nizSlika.size(); i++) {
            driver
                    .findElements(By.className("sc-ezWOiH"))
                    .get(i)
                    .click();

            driver
                    .findElement(By.xpath("//div[contains(text(),'+ Add photo')]"))
                    .click();
            driver
                    .findElement(By.id("imageUpload"))
                    .sendKeys(nizSlika.get(i).getAbsolutePath());
            wait
                    .until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[@loading='lazy']"), i + 1));
            driver
                    .findElements(By.xpath("//*[@loading='lazy']")).get(i)
                    .click();
            driver
                    .findElement(By.xpath("//button[contains(text(),'Use One Side Only')]"))
                    .click();
        }
        List<WebElement> confeties = driver.findElements(By.className("fajlzv"));
        Random random = new Random();
        int randomConfetti = random.nextInt(confeties.size());
        confeties
                .get(randomConfetti)
                .click();
        driver
                .findElement(By.xpath("//button[@type='submit']"))
                .click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@action='error']")));
        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.xpath("//*[@action='error']"),
                        "Oops! It looks like you`ve not added an text to this field, please add one before continuing."));


    }
}
