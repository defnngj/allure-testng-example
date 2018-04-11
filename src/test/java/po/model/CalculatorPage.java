package po.model;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalculatorPage {

    private AndroidDriver driver;

    // 声明对象时，自动加载页面
    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 加号
    public void plus() {
        this.driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
    }

    // 减号
    public void minus() {
        this.driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
    }

    // 乘号
    public void times(){
        this.driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
    }

    // 除号
    public void division(){
        this.driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
    }

    // 等号
    public void equal(){
        this.driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }

    // 结果
    public String result(){
        return this.driver.findElement(By.id("com.android.calculator2:id/result")).getText();
    }

    // 删除
    public void clear(){
        this.driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    // 1
    public void number_1(){
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
    }

    // 2
    public void number_2(){
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
    }

    // 3
    public void number_3(){
        driver.findElementByAndroidUIAutomator("text(\"3\")").click();
    }

    // 4
    public void number_4(){
        driver.findElementByAndroidUIAutomator("text(\"4\")").click();
    }
    // 5
    public void number_5(){
        driver.findElementByAndroidUIAutomator("text(\"5\")").click();
    }

    // 6
    public void number_6(){
        driver.findElementByAndroidUIAutomator("text(\"6\")").click();
    }

    // 7
    public void number_7(){
        driver.findElementByAndroidUIAutomator("text(\"7\")").click();
    }

    // 8
    public void number_8(){
        driver.findElementByAndroidUIAutomator("text(\"8\")").click();
    }

    // 9
    public void number_9(){
        driver.findElementByAndroidUIAutomator("text(\"9\")").click();
    }

    // 0
    public void number_0(){
        driver.findElementByAndroidUIAutomator("text(\"0\")").click();
    }

}
