package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String SEARCHFIELD = "u_0_2";
    public static final String XPATH_NAME = "//input[@name = \"firstname\" and @id = \"u_2_b\"]";
    public static final String XPATH_DAY = "//span[contains(@class,\"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class,\"_5k_4\")]/span/select[2]";
    public static final String XPATH_Year = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        Thread.sleep(4000);

        WebElement clickButton = driver.findElement(By.id(SEARCHFIELD));
        clickButton.click();
        Thread.sleep(4000);

        WebElement selectNameField = driver.findElement(By.xpath(XPATH_NAME));
        selectNameField.sendKeys("Kamil");
        Thread.sleep(4000);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo1);
        selectDay.selectByIndex(2);
        Thread.sleep(4000);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(3);
        Thread.sleep(4000);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_Year));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1990");
        Thread.sleep(4000);
    }
}


