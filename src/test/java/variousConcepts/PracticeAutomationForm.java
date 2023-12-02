package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationForm {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void positiveLoginTest() {
		driver.findElement(By.name("firstname")).sendKeys("Betelhem");
		driver.findElement(By.name("lastname")).sendKeys("Samson");
		driver.findElement(By.name("Password")).sendKeys("12236dfg26");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-4")).click();
		driver.findElement(By.id("profession-1")).click();
		//driver.findElement(By.id("datepicker")).sendKeys(null);
	}

}
