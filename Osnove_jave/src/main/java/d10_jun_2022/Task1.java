package d10_jun_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//1.Zad
//Napisati program koji:
//Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element
// obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//POMOC: Brisite elemente odozdo.
//(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.manage().window().maximize();
        driver.navigate().to(url);
        List<WebElement>elements = driver.findElements(By.xpath("//*[contains(@class,'close')]"));
        for (int i = elements.size()-1; i >=0 ; i--) {
            driver.findElements(By.xpath("//*[contains(@class,'close')]")).get(i).click();
            Thread.sleep(5000);
            if (elementExist(driver,By.xpath("//*[contains(@class,'close')]["+(i+1)+"]"))){
                System.out.println("Element exist!");
            }else{
                System.out.println("Element doesn't exist!");
            }

        }
        driver.quit();

    }
    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }

}

