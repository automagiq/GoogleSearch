package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.BasePage;

public class GoogleHomePage extends BasePage
{
  private String title = "Google";
  private static String URL = "https://www.google.com/";
  // elements
  By searchBox = By.name("q");
  By searchButton = By.name("btnK");
  // constructor
  public GoogleHomePage(WebDriver driver)
  {
    this.driver = driver;
    assertEquals(title, driver.getTitle(), "This is not the Google page");
  }

  // services
  public static GoogleHomePage open(WebDriver driver)
  {
    driver.get(URL);
    return new GoogleHomePage(driver);
  }
  public GoogleSearchResults submitSearch(String searchTerm)
  {
    driver.findElement(searchBox).sendKeys(searchTerm);
    clickElement(searchButton);
    return new GoogleSearchResults(driver);
  }
}