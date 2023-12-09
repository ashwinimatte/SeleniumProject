package RahulshettyAcademy.SeleniumFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//MyEclipse 5.1.1 GA//geckodriver-v0.32.2-win64//geckodriver.exe");
	
    WebDriver driver = new FirefoxDriver();
    driver.get("https://altoconvertpdftojpg.com/");

    driver.findElement(By.id("browse")).click();

    Thread.sleep(3000);
}
}