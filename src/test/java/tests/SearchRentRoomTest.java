package tests;

import org.testng.annotations.Test;
import pages.CianHomePage;
import pages.CianRentRoomPage;
import tests.BaseTest;
import utils.Log4j;

public class SearchRentRoomTest extends BaseTest {

    @Test
    public void checkIsRedirectToRentRoomPage() {
        Log4j.info("Открываем cian.ru");
        CianHomePage cianHomePage = new CianHomePage();
        cianHomePage.findRentRoom();
        Log4j.info("Проверяем, что был выполнен переход на страницу аренды квартир");
        CianRentRoomPage cianRentRoomPage = new CianRentRoomPage();
        cianRentRoomPage.checkTitleValue();
    }
}