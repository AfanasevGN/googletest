package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class GoogleSearchPage {
  protected final Page page;
  public final Locator javaSite;

  public GoogleSearchPage(Page page){
    this.page = page;
    this.javaSite = page.locator("xpath=//a[@href='https://www.java.com/ru/']");
  }

  public void clickOnLink(){
    javaSite.click();
  }
}

