package core;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
  private Browser browser;
  protected Page page;
  private BrowserContext context;
  private Boolean isTraceEnabled = false;

  @BeforeClass
  public void setUp() {
    browser = Playwright
        .create()
        .firefox()
        .launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("firefox"));

    context = browser.newContext();

    if(isTraceEnabled) {
      context.tracing().start(new Tracing.StartOptions()
          .setScreenshots(false)
          .setSnapshots(false)
          .setSources(false));
    }

    page = context.newPage();
  }

  @AfterClass
  public void tearDown() {
    if (browser != null) {
      browser.close();
      browser = null;
    }
  }
}