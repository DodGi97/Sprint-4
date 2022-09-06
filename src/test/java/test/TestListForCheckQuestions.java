package test;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import pageobject.FrequentlyAskedQuestions;
import settings.BaseSelenium;

import static org.hamcrest.CoreMatchers.containsString;

//Проверки часто задаваемых вопросов через GoogleChrome.
public class TestListForCheckQuestions extends BaseSelenium {
    @Test
    public void shouldOpenAndCheckTextForOneQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionOne();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = objectAskedQuestions.getQuestionTextOne();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForTwoQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionTwo();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objectAskedQuestions.getQuestionTextTwo();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForThreeQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionThree();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = objectAskedQuestions.getQuestionTextThree();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFourQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionFour();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objectAskedQuestions.getQuestionTextFore();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFiveQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionFive();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objectAskedQuestions.getQuestionTextFive();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSixQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionSix();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objectAskedQuestions.getQuestionTextSix();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSevenQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionSeven();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objectAskedQuestions.getQuestionTextSeven();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForEightQuestion() {
        FrequentlyAskedQuestions objectAskedQuestions = new FrequentlyAskedQuestions();
        objectAskedQuestions.acceptCookies();
        objectAskedQuestions.clickOnTopicQuestionEight();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objectAskedQuestions.getQuestionTextEight();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

}
