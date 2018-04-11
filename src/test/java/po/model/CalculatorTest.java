package po.model;


/**
 * appium test sample
 * author : 虫师
 */

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.*;
import po.model.CalculatorPage;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    private AndroidDriver driver;
    private CalculatorPage page;

    @BeforeClass
    public void startApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");

        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
        this.page = new CalculatorPage(this.driver);
    }

    // 关闭APP
    @AfterClass
    public void closeApp(){
        driver.quit();
    }

    // 清空结果
    @AfterMethod
    public void clearResult(){
        this.page.clear();
    }

    @Test
    public void addCase1() throws InterruptedException {
        this.page.number_1();
        this.page.plus();
        this.page.number_1();
        this.page.equal();
        Thread.sleep(1000);
        String result = this.page.result();
        assertEquals(result, "2");
    }

    @Test
    public void addCase2() throws InterruptedException {
        this.page.number_2();
        this.page.plus();
        this.page.number_2();
        this.page.equal();
        Thread.sleep(1000);
        String result = this.page.result();
        assertEquals(result, "4");
    }

    @Test
    public void subCase1() throws InterruptedException {
        this.page.number_5();
        this.page.minus();
        this.page.number_2();
        this.page.equal();
        Thread.sleep(1000);
        String result = this.page.result();
        assertEquals(result, "3");
    }

}

