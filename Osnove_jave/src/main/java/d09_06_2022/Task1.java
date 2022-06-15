package d09_06_2022;
//1.Zadatak
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude preko
// id atributa i za ovo trebace vam contains u xpath-u
//Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element preko indeksa
//Na kraju programa ugasite pretrazivac.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.manage().window().maximize();
        driver.navigate().to(url);
        System.out.print("Enter your raitng:");
        int num = s.nextInt();
        List<WebElement>ratings = driver
                        .findElements(By.xpath("//button[contains(@id,'rating-star')]"));

        ratings.get(num-1).click();

        Thread.sleep(2000);
//        driver.quit();







    }
}
