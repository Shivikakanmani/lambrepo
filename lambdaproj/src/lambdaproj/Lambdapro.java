package lambdaproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lambdapro {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("abc2gmail.com");
   	 driver.findElement(By.name("password")).sendKeys("abcdefg");
   	 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input")).click();
	}
}
