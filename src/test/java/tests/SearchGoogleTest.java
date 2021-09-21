package tests;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;
import pages.GoogleHomePage;
import pages.GoogleSearchResults;

class SearchGoogleTest extends BaseTest
{
  @Test
  void test()
  {
    GoogleSearchResults results = GoogleHomePage.open(driver)
      .submitSearch("Selenium");
    List<WebElement> links = driver.findElements(By.partialLinkText("Selenium"));
    assertTrue(links.size() >= 1);
  }
}