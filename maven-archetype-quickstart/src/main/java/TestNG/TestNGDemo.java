package TestNG;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class TestNGDemo {



/*

* TestNG:

* Test Next Generation

* it is a unit testing framework

* inspired from JUnit and NUnit

* Its open source and free

* Prior to this we had JUnit

* 

* Features:

* 1. Various Annotations

* 2. HTML Report

* 3. Priority/Sequencing

* 4. Dependency

* 5. Grouping of TC

* 6. Data Provider

* 7. Assertion

* 8. testng.xml file

* 

* Step1: get the eclipse url

* 

* step2: Eclipse >> Help >> Install New software

* restart once done

* 

*/

WebDriver driver;

 

@BeforeMethod

public void setUp() {

WebDriverManager.chromedriver().setup();

driver = new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

}

 

@Test

public void validateUserName() {

boolean userName = driver.findElement(By.id("txtUsername")).isDisplayed();

Assert.assertTrue(userName);

}

 

@AfterMethod

public void tearDown() {

driver.quit();

}

 

 

/*

* 1. Validate the title of the page is OrangeHRM

* 2. Validate username field is displayed

* 3. Validate Login Panel Text is displayed

* 4. In Users tab >> Search for ajay >> No record found should be displayed

* 5. In Users tab >> Search for aravind >> Atleast one record should be displayed

*/

 

}