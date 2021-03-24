package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class UnlockPhoneSteps {
    @Given("I unlock the phone and enter to Tunnel")
    public void checkTunnel() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new
                DesiredCapabilities();
        desiredCapabilities.setCapability("appium-version", "1.0");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "Android Test");
        desiredCapabilities.setCapability("appPackage", "com.mobileiron.tunnel.android.release");
        desiredCapabilities.setCapability("appActivity", "com.mobileiron.centaur.android.MainActivity");
        desiredCapabilities.setCapability("autoLaunch", false);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver appiumDriver = new AppiumDriver(url, desiredCapabilities);
        (new TouchAction(appiumDriver)).press(PointOption.point(386, 1573)).moveTo(PointOption.point(349, 641)).release().perform();
        MobileElement el1 = (MobileElement) appiumDriver.findElementByAccessibilityId("1");
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementByAccessibilityId("Aceptar");
        el2.click();
        appiumDriver.launchApp(); //abre la aplicacion
        Thread.sleep(10000);
        List<WebElement> connected = appiumDriver.findElementsByXPath("//android.widget.TextView[2][@text='Connected to Server appcer.silkplace.es']");
        Assert.assertTrue(connected.size() > 0);
    }

    @Given("I unlock the phone and enter to Email")
    public void iUnlockThePhoneAndEnterToEmail() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new
                DesiredCapabilities();
        desiredCapabilities.setCapability("appium-version", "1.0");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "Android Test");
        desiredCapabilities.setCapability("appPackage", "com.mobileiron.client.android.pim");
        desiredCapabilities.setCapability("appActivity", "com.enterproid.app.email.activity.MessageListActivity");
        desiredCapabilities.setCapability("autoLaunch", false);
        desiredCapabilities.setCapability("autoGrantPermissions","true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver appiumDriver = new AppiumDriver(url, desiredCapabilities);
        (new TouchAction(appiumDriver)).press(PointOption.point(386, 1573)).moveTo(PointOption.point(349, 641)).release().perform();
        MobileElement el1 = (MobileElement) appiumDriver.findElementByAccessibilityId("1");
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementByAccessibilityId("Aceptar");
        el2.click();
        appiumDriver.launchApp(); //abre la aplicacion

        MobileElement sendEmailFloatingButton = (MobileElement) appiumDriver.findElementById("com.mobileiron.client.android.pim:id/floating_btn");
        sendEmailFloatingButton.click();

        MobileElement enviar = (MobileElement) appiumDriver.findElementByAccessibilityId("Enviar");
        enviar.click();

        MobileElement para = (MobileElement) appiumDriver.findElementById("com.mobileiron.client.android.pim:id/to");
        para.sendKeys("gabrieli@externos.itnow.es");


        Thread.sleep(10000);
        List<WebElement> connected = appiumDriver.findElementsByXPath("//android.widget.TextView[2][@text='Connected to Server appcer.silkplace.es']");
        Assert.assertTrue(connected.size() > 0);
    }
}
