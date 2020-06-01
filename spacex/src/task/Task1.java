package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http:\\www.spacex.com");
driver.findElement(By.xpath("//*[@id=\'navigation\']/nav/div/ul[2]/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\'main\']/section[2]/div/div/div[1]/ul/li[13]/a/h4")).click();
driver.findElement(By.xpath("//*[@id=\'edit_type_chosen\']/ul/li/input")).click();
driver.findElement(By.xpath("//*[@id=\'edit_type_chosen\']/ul/li/input")).sendKeys("Full-Time");
driver.findElement(By.xpath("//*[@id=\'edit_type_chosen\']/ul/li/input")).sendKeys(Keys.ENTER);
driver.findElement(By.cssSelector("#edit_location_chosen > ul > li > input")).click();
driver.findElement(By.cssSelector("#edit_location_chosen > ul > li > input")).sendKeys(Keys.ENTER);
driver.findElement(By.cssSelector("#edit-submit-careers")).click();
	}

}
//#edit_location_chosen > ul > li > input
///*[@id="edit_type_chosen"]/ul/li[1]/span