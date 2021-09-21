package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.BasePage;

public class GoogleSearchResults extends BasePage
{
  private String title = "Selenium - Google Search";
  // constructor
  public GoogleSearchResults(WebDriver driver)
  {
    this.driver = driver;
    assertEquals(title, driver.getTitle(), "This is not the Google results page");
  }
}

