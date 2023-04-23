package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CianRentRoomPage extends BasePage {

    @FindBy(xpath = "//h1[@class=\"_93444fe79c--color_black_100--kPHhJ _93444fe79c--lineHeight_36px--enZAo _93444fe79c--fontWeight_bold--ePDnv _93444fe79c--fontSize_28px--xlUV0 _93444fe79c--display_block--pDAEx _93444fe79c--text--g9xAG _93444fe79c--text_letterSpacing__normal--xbqP6\"]")
    private WebElement title;

    public CianRentRoomPage() {
        PageFactory.initElements(driver, this);
    }

    public CianRentRoomPage checkTitleValue() {
        String countCard = title.getText();
        Assert.assertEquals(countCard, "Аренда 1-комн и 2-комн квартир в Москве");
        return this;
    }
}
