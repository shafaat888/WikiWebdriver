import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Webdriverwiki {
	public static WebDriver driver;
@BeforeTest
public void setup()
{
	System.setProperty("webdriver.gecko.driver","E:\\GitHub\\WebdriverWiki\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
	driver.get("https://www.wikipedia.org/");
	
}
@Test
public void testwiki()
{
	Select select =new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
	select.selectByValue("az");
}
@AfterTest
public void teardown()
{
driver.quit();	
}
}
