
/**
 * appium test sample
 * author : 虫师
 */
package my.company;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class AppTest {
    private static AndroidDriver driver;

    // 启动App
    @BeforeClass
    public static void starApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
    }

    // 关闭APP
    @AfterClass
    public static void closeApp(){
        driver.quit();
    }

    // 清空结果
    @AfterMethod
    public static void clearResult(){
        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    @Test
    public void addCase1() throws InterruptedException {
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"+\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"=\")").click();
        Thread.sleep(1000);
        String result = driver.findElement(By.id("com.android.calculator2:id/result"))
                .getText();
        assertEquals(result, "2");
    }

    @Test
    public void addCase2() throws InterruptedException {
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"+\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"=\")").click();
        Thread.sleep(1000);
        String result = driver.findElement(By.id("com.android.calculator2:id/result"))
                .getText();
        assertEquals(result, "4");
    }

    @Test
    public void subCase1() throws InterruptedException {
        driver.findElementByAndroidUIAutomator("text(\"5\")").click();
        driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"=\")").click();
        Thread.sleep(1000);
        String result = driver.findElement(By.id("com.android.calculator2:id/result"))
                .getText();
        assertEquals(result, "3");
    }

}
