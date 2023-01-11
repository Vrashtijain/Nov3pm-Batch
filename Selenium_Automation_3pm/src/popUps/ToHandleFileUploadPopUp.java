package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//now pop up will open to upload resume and in that pop up cursor already present in file name text field
		//not able to inspect , using 3rd party tool
		//create autoIt folder in our project and then to paste .exe file in it, first create a docx file by writing anything like demoResume and save it then search its properties to copy the path
		//then open c drive and click on program files(*86) then autoIt3 and then select sciTE and again sciTE 
		/*Now write inside it 
		 	sleep(2000)
			send("C:\Users\vrash\OneDrive\Documents\DemoResume.docx")
			sleep(2000)
			send("{ENTER}")
			paste the copied path inside send and forward slash and file name
			then save it by name FileUpload.exe and click on tool and compile now exe file generated paste it inside our autoIt folder
			*/
		Runtime.getRuntime().exec("./autoIt/FileUpload.exe");
		
	}
}
