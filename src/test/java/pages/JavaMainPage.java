package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class JavaMainPage {
  protected final Page page;
  public final Locator download;

  public JavaMainPage(Page page) {
    this.page = page;
    this.download = page.locator (".jvdla0");
  }

  public void goToDownldoad(){
    download.click();
  }
}

