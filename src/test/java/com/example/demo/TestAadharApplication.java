

package com.example.demo;

//import org.testng.annotations.Test;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Reporter;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
public class TestAadharApplication {
	/*
	
	 WebDriver wd=null;
	 @BeforeTest
	  public void beforeTest() {
	    WebDriverManager.chromedriver().setup();
	    wd=new ChromeDriver();
	    wd.manage().window().maximize();
		
	    }
	 
	 @Test(priority=1,enabled=false)
	 public void userLoginTest()
	 {
		 wd.get("http://localhost:4200/signin");
		 wd.findElement(By.name("email")).sendKeys("suresh@gmail.com");
		 wd.findElement(By.name("password")).sendKeys("123456789");
		 wd.findElement(By.xpath("/html/body/app-root/app-signin/div/form/button[1]")).click();
		 Reporter.log("User Login Tested Successfully!");
	
	 }
	 @Test(priority=2,enabled = false)
	 public void applyAadharTest() throws InterruptedException
	 {
		//String dateToInput = "2023-08-03";
		wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		wd.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div[2]/div/div/button[1]")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("cname")).sendKeys("Gugan");
		wd.findElement(By.name("cdob")).sendKeys("03-08-2023");
		wd.findElement(By.name("cemail")).sendKeys("guga@gmail.com");
		wd.findElement(By.name("cmobile")).sendKeys("2582582587");
		wd.findElement(By.name("caddress")).sendKeys("No 785, Mission Street, Tenkasi");
		wd.findElement(By.name("cgender")).sendKeys("Male");
		wd.findElement(By.xpath("//*[@id=\"applynewaadhar\"]/div/div/div[2]/form/input")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("/html/body/app-root/app-home/div[2]/div/div/div[1]/button/span")).click();
		
		 Reporter.log("Apply Aadhar Tested Successfully!");
		
		
	 }
   @Test(priority=3,enabled=false)
   public void viewAadharTest() throws InterruptedException
   {
		wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	   wd.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div[2]/div/div/button[2]")).click();
	   wd.findElement(By.name("Vcmobile")).sendKeys("2582582587");
	   wd.findElement(By.name("viewaadharbtn")).click();
	   Thread.sleep(5000);
	   wd.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/div/div[1]/button/span")).click();
	   
	   Reporter.log("View Aadhar Tested Successfully!");
	   
	   
   }
   
   @Test(priority=4,enabled=false)
   public void updateAadharTest() throws InterruptedException
   {
	   wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	   wd.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div[2]/div/div/button[3]")).click();
	   wd.findElement(By.name("ugcmobile")).sendKeys("2582582587");
	   wd.findElement(By.name("getdetailstoupdate")).click();
	   Thread.sleep(3000);
	   wd.findElement(By.name("ucmobile")).sendKeys("5555555555");
	   wd.findElement(By.name("ucaddress")).sendKeys("No 5, Chengalpattu");
	   wd.findElement(By.name("ucdob")).sendKeys("10-08-2023");
	   wd.findElement(By.name("updateabtn")).click();
	   Thread.sleep(3000);
	   wd.findElement(By.xpath("/html/body/app-root/app-home/div[4]/div/div/div[1]/button/span")).click();
	   
	   Reporter.log("Update Aadhar Tested Successfully!");
	   
   }
   
   @Test(priority=5)
   public void adminloginTest()
   {
	     wd.get("http://localhost:4200/signin");
		 wd.findElement(By.name("email")).sendKeys("admin@gmail.com");
		 wd.findElement(By.name("password")).sendKeys("admin");
		 wd.findElement(By.xpath("/html/body/app-root/app-signin/div/form/button[2]")).click();
		 
		 Reporter.log("Admin Login Tested Successfully!");
   }
   
   @Test(priority=6,enabled=false)
   public void aadharApproveTest()
   {
	   wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	   wd.findElement(By.xpath("/html/body/app-root/app-applyaadhar/div[1]/div[2]/div/div/table/tbody/tr[1]/td[10]/button")).click();
	   wd.findElement(By.name("rcmobile")).sendKeys("9159423116");
	   wd.findElement(By.name("rcstatus")).sendKeys("Approve");
	   wd.findElement(By.name("requestbtn")).click();
	   wd.findElement(By.name("closebtn")).click();
	   
	   Reporter.log("Approve Aadhar Tested Successfully!");
   }
   
   @Test(priority=7)
   public void deleteCitizenTest()
   {
	   wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	   wd.findElement(By.name("delciti")).click();
	   
	   Reporter.log("Delete Aadhar Tested Successfully!");
   }
   
   */
}


