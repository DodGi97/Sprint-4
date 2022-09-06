package test;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import pageobject.OrderPage;
import settings.BaseSelenium;
import test.test_data.Order;
import test.test_data.User;

import static org.hamcrest.CoreMatchers.containsString;

//Проверки формирования заказов через GoogleChrome.
public class TestListForCreateOrder extends BaseSelenium {

    @Test
    public void shouldCreateCorrectOrderForDeliverySamokat() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();

        objectOrderPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Иван"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Гудим"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Проспект мира 66"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetro();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89236823155"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("10.09.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setColorSamokat();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));
    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatNumberTwo() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();

        objectOrderPage.clickButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Алексей"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Горичев"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Ленина 88"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89236753457"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("11.01.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setColorSamokat();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №1"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));
    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButton() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();

        objectOrderPage.clickDownButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Сильвестр"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Акапьян"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Карла Маркса 13 корпус 3"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89137754457"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("12.12.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №3 !"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }


    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButtonNumberTwo() {
        OrderPage objectOrderPage = new OrderPage();
        User userForOrder = new User();
        Order dateForOrder = new Order();

        objectOrderPage.clickDownButtonOrder();
        objectOrderPage.setFieldName(userForOrder.setNameUser("Наталья"));
        objectOrderPage.setFieldLasteName(userForOrder.setLastName("Мартынова"));
        objectOrderPage.setAdress(dateForOrder.setAddress("Ленина 88"));
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone(dateForOrder.setNumberPhone("89137654386"));
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat(dateForOrder.setDeliveryDate("1.11.2022"));
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery(dateForOrder.setComment("Тестовый комментарий №@#!# 12345 !"));
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAcceptOrder();
        String expected = "Заказ оформлен";
        String actual = objectOrderPage.getOrderText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }
}

