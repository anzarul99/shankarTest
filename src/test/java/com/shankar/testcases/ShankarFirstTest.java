package com.shankar.testcases;

import org.openqa.selenium.By;

import com.shankar.base.SBaseTest;
import com.shankar.utils.ShFileUtils;

public class ShankarFirstTest extends SBaseTest {
	
	private static String testId;
	private static String testCaseName;

	public ShankarFirstTest() {
		super(testId, testCaseName);
		
	}

	@Override
	public void runTest() throws Exception {
		getBrowser("chrome","https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='my-text-id']")).sendKeys("Shankar");
		driver.findElement(By.name("my-password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
		Thread.sleep(500);
		driver.quit();
		String jsonInput = ShFileUtils.readJsonFile("homepage.json");
		String testData = ShFileUtils.readJsonData(jsonInput, "$.data[0].username");
		System.out.println(testData);
		
		String propData= ShFileUtils.readLocatore("homepage", "url");
		System.out.println(propData);
		
		
		
	}

}
