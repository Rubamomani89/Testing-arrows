import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_arrow_booking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\C-ROAD\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		driver.findElement(By.id("ss")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(Keys.ARROW_DOWN+Keys.ENTER);(doesn't allow!just sting on the first arg)
		Keys MyKeys=Keys.ARROW_DOWN ;
		Keys PressEnter= Keys.ENTER;
		String city="amman";
		
		//driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Amman"+ MyKeys +Keys.ENTER);	when we do this its give
		//something doesn't 	match with the real site.we suppose the selenium very vast so we need to add tread().sleep
		
		driver.findElement(By.id("ss")).sendKeys(city);
		Thread.sleep(3000);
		driver.findElement(By.id("ss")).sendKeys( MyKeys);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(PressEnter);
		
		
				}

}
