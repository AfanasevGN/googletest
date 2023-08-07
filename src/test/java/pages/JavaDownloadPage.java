package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class JavaDownloadPage {
  protected final Page page;
  public final Locator actualVersion;

  public JavaDownloadPage(Page page){
    this.page = page;
    this.actualVersion = page.locator("h4.sub");
  }

  public void printActualVersion() {
    System.out.println(actualVersion.innerText());

  }
}

