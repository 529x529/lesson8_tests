package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static constants.Constants.Urls.CIAN_HOME_PAGE;

public class CianHomePage extends BasePage {

    @FindBy(xpath = "//a[@href=\"/snyat/\"]")
    private WebElement rentRoomBtn;

    @FindBy(xpath = "//a[@class=\"_025a50318d--button--ljPOU\"]")
    private WebElement findBtn;

    public CianHomePage() {
        driver.get(CIAN_HOME_PAGE);
        PageFactory.initElements(driver, this);
    }

    public CianHomePage findRentRoom() {
        rentRoomBtn.click();
        findBtn.click();
        return this;
    }
}
