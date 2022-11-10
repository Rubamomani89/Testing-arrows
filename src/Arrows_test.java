import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrows_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C-ROAD\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.findElement(By.xpath("//*[@id=\"My_Select\"]")).click();
		Keys TheKeys = Keys.ARROW_DOWN;
		driver.findElement(By.xpath("//*[@id=\"My_Select\"]")).sendKeys(TheKeys);
		// driver.findElement(By.xpath("//*[@id=\"My_Select\"]")).sendKeys("m"+Keys.ENTER);

	}

}
