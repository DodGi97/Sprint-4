package test;

import PageObject.FrequentlyAskedQuestions;
import PageObject.OrderPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.By;
import settings.BaseSelenium;

import static org.hamcrest.CoreMatchers.containsString;

public class TestList extends BaseSelenium {

    //Проверки формирования заказов через GoogleChrome.
    @Test
    public void shouldCreatCorrectOrderForDeliverySamokat(){
    OrderPage objectOrderPage = new OrderPage();
    By textByOrder = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");
    objectOrderPage.clickButtonOrder();
    objectOrderPage.setFieldName("Иван");
    objectOrderPage.setFieldLasteName("Гудим");
    objectOrderPage.setAdress("Проспект Мира, 66");
    objectOrderPage.clicktStationMetro();
    objectOrderPage.setStationMetro();
    objectOrderPage.setNumberPhone("89236753457");
    objectOrderPage.clickButtonNext();
    objectOrderPage.setWhereSendSamokat("10.09.2022");
    objectOrderPage.clickTimeRent();
    objectOrderPage.setTimeRent();
    objectOrderPage.setColorSamokat();
    objectOrderPage.setCommentForDelivery("Тестовый комментарий");
    objectOrderPage.clickCreateOrder();
    objectOrderPage.clickAsseptOrder();
    String expected = "Заказ оформлен";
    String actual = driver.findElement(textByOrder).getText();
    MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));
    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatNumberTwo(){
        OrderPage objectOrderPage = new OrderPage();
        By textByOrder = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");
        objectOrderPage.clickButtonOrder();
        objectOrderPage.setFieldName("Алексей");
        objectOrderPage.setFieldLasteName("Горичев");
        objectOrderPage.setAdress("Ленина 88");
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone("89236753457");
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat("11.10.2022");
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setColorSamokat();
        objectOrderPage.setCommentForDelivery("Тестовый комментарий номер 2");
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAsseptOrder();
        String expected = "Заказ оформлен";
        String actual = driver.findElement(textByOrder).getText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }

    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButton() {
        OrderPage objectOrderPage = new OrderPage();
        By textByOrder = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");
        objectOrderPage.clickDownButtonOrder();
        objectOrderPage.setFieldName("Сельвестр");
        objectOrderPage.setFieldLasteName("Акапьян");
        objectOrderPage.setAdress("Карла Маркса 13 корпус 3");
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone("89236753999");
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat("11.11.2022");
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery("Тестовый комментарий номер 3!");
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAsseptOrder();
        String expected = "Заказ оформлен";
        String actual = driver.findElement(textByOrder).getText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }


    @Test
    public void shouldCreatCorrectOrderForDeliverySamokatWithHelpDownOrderButtonNumberTwo() {
        OrderPage objectOrderPage = new OrderPage();
        By textByOrder = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");
        objectOrderPage.clickDownButtonOrder();
        objectOrderPage.setFieldName("Наталья");
        objectOrderPage.setFieldLasteName("Мартынова");
        objectOrderPage.setAdress("Лермонтова 88");
        objectOrderPage.clicktStationMetro();
        objectOrderPage.setStationMetroTwo();
        objectOrderPage.setNumberPhone("89236758799");
        objectOrderPage.clickButtonNext();
        objectOrderPage.setWhereSendSamokat("13.12.2022");
        objectOrderPage.clickTimeRent();
        objectOrderPage.setTimeRent();
        objectOrderPage.setChooseColorSamokatGrey();
        objectOrderPage.setCommentForDelivery("Тестовый комментарий номер 4!@#$!");
        objectOrderPage.clickCreateOrder();
        objectOrderPage.clickAsseptOrder();
        String expected = "Заказ оформлен";
        String actual = driver.findElement(textByOrder).getText();
        MatcherAssert.assertThat("Информация о сформированном заказе отсутсвует", actual, containsString(expected));

    }
//Проверки часто задаваемых вопросов через GoogleChrome.
    @Test
    public void shouldOpenAndCheckTextForOneQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-0']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionOne();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForTwoQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-1']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionTwo();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForThreeQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-2']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionThree();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFourQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-3']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionFour();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFiveQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-4']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionFive();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSixQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-5']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionSix();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSevenQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-6']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionSeven();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForEightQuestion(){
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        By textQuestion = By.xpath("//div[@id= 'accordion__panel-7']");
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionEight();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(textQuestion).getText();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }


}
