package common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
  protected WebDriver driver;

  @BeforeAll
  static void oneTimeSetUp()
  {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUpBase() throws Exception
  {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterEach
  void tearDown() throws Exception
  {
    driver.quit();
  }
}