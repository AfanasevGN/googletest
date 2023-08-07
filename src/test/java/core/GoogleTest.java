package core;

import org.testng.annotations.Test;
import pages.GoogleMainPage;
import pages.GoogleSearchPage;
import pages.JavaDownloadPage;
import pages.JavaMainPage;

public class GoogleTest extends BaseTest{
  //Открыть страницу гугл
  //Ввести java
  //Перейти на сайт java.com
  //Перейти в загрузки
  //Вывести рекомендуемую версию java

  @Test
  public void showActualJavaVersion(){
    GoogleMainPage googleMainPage = new GoogleMainPage(page);
      googleMainPage.navigate();
      googleMainPage.searchJava();
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(page);
      googleSearchPage.clickOnLink();
    JavaMainPage javaMainPage = new JavaMainPage(page);
      javaMainPage.goToDownldoad();
    JavaDownloadPage javaDownloadPage = new JavaDownloadPage(page);
      javaDownloadPage.printActualVersion();
  }


}

