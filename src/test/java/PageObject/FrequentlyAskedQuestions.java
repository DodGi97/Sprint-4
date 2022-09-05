package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;

public class FrequentlyAskedQuestions extends BaseSeleniumPage{
    //кнопка для куков "да все привыкли"
    private By buttonAcceptCookies = By.xpath("//button[text() = 'да все привыкли']");
    //элемент web-страницы со списком вопросов
    private By elementWithQuestions = By.xpath("//div[@class = 'accordion']");
    //первый вопрос
    private By oneQuestion = By.xpath("//div[@id= 'accordion__heading-0']");
    //второй вопрос
    private By twoQuestion = By.xpath("//div[@id= 'accordion__heading-1']");
    //третий вопрос
    private By threeQuestion = By.xpath("//div[@id= 'accordion__heading-2']");
    //четвертый вопрос
    private By fourQuestion = By.xpath("//div[@id= 'accordion__heading-3']");
    //пятый вопрос
    private By fiveQuestion = By.xpath("//div[@id= 'accordion__heading-4']");
    //шестой вопрос
    private By sixQuestion = By.xpath("//div[@id= 'accordion__heading-5']");
    //седьмой вопрос
    private By sevenQuestion = By.xpath("//div[@id= 'accordion__heading-6']");
    //восьмой вопрос
    private By eightQuestion = By.xpath("//div[@id= 'accordion__heading-7']");


    //методы для работы с объектами страницы

    public void acceptCookies(){
        driver.findElement(buttonAcceptCookies).click();
    }
    public void clickOnTopicQuestionOne(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(oneQuestion).click();

    }
    public void clickOnTopicQuestionTwo(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(twoQuestion).click();

    }

    public void clickOnTopicQuestionThree(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(threeQuestion).click();

    }

    public void clickOnTopicQuestionFour(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fourQuestion).click();

    }

    public void clickOnTopicQuestionFive(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fiveQuestion).click();
    }

    public void clickOnTopicQuestionSix(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(sixQuestion).click();
    }

    public void clickOnTopicQuestionSeven(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(sevenQuestion).click();
    }
    public void clickOnTopicQuestionEight(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(eightQuestion).click();
    }


}
