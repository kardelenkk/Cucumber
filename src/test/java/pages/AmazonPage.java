package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*

       TestNG'de page class'lari
       surekli kullandigimiz bir sayfa / websitesi'ndeki
       locate'leri ve
       ilgili sayfada kullanilacak login gibi basit method'lari icerir.

       TestNG page class'larindaki locate'lere erisim icin
       Test class'larinda page class'indan obje olusturulmasi benimsemistir.
     */

    public AmazonPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement ilkUrunIsimElementi;
}
