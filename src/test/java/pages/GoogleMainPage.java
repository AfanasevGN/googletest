package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class GoogleMainPage {
  protected final Page page;
  public final Locator inputSearch;

  public GoogleMainPage(Page page) {
    this.page = page;
    this.inputSearch = page.locator("#APjFqb");
  }

  public void navigate() {
    page.navigate("https://www.google.com/?hl=ru");
  }

  public void searchJava(){
    inputSearch.click();
    inputSearch.fill("java");
    page.keyboard().press("Enter");


  }


}