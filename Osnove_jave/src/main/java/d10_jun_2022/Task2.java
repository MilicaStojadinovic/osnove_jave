package d10_jun_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

//2.Zadatak
//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://geodata.solutions/";
        driver.navigate().to(url);
        Random random = new Random();

        Select selectCountry = new Select(driver.findElement(By.id("countryId")));
        int randomCountry = random.nextInt(selectCountry.getOptions().size());
        selectCountry.selectByIndex(randomCountry);
        Thread.sleep(3000);
        Select selectStates = new Select(driver.findElement(By.id("stateId")));
        int randomStates = random.nextInt(selectStates.getOptions().size());
        selectStates.selectByIndex(randomStates);
        Thread.sleep(3000);
        Select selectCity = new Select(driver.findElement(By.id("cityId")));
        int randomCity = random.nextInt(selectCity.getOptions().size());
        selectCity.selectByIndex(randomCity);


    }
}
