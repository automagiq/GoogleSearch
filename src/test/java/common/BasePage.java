package common;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
  protected WebDriver driver;
// stable operations

  protected void clickElement(By locator)
  {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
  }
  protected void visibleElement(By locator)
  {
    new WebDriverWait(driver, 15)
      .until(ExpectedConditions.visibilityOfElementLocated(locator));
  }
}
