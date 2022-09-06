package pageobject;

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
    //текст первого вопрос
    private By textOneQuestion = By.xpath("//div[@id= 'accordion__panel-0']");
    //текст второго вопроса
    private By textTwoQuestion = By.xpath("//div[@id= 'accordion__panel-1']");
    //текст третьего вопроса
    private By textThreeQuestion = By.xpath("//div[@id= 'accordion__panel-2']");
    //текст четвертого вопроса
    private By textForeQuestion = By.xpath("//div[@id= 'accordion__panel-3']");
    //текст пятого вопроса
    private By textFiveQuestion = By.xpath("//div[@id= 'accordion__panel-4']");
    //текст шестого вопроса
    private By textSixQuestion = By.xpath("//div[@id= 'accordion__panel-5']");
    //текст седьмого вопроса
    private By textSevenQuestion = By.xpath("//div[@id= 'accordion__panel-6']");
    //текст восьмого вопроса
    private By textEightQuestion = By.xpath("//div[@id= 'accordion__panel-7']");




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

    public String getQuestionTextOne(){
        driver.findElement(textOneQuestion).getText();
        return driver.findElement(textOneQuestion).getText();
    }

    public String getQuestionTextTwo(){
        driver.findElement(textTwoQuestion).getText();
        return driver.findElement(textTwoQuestion).getText();
    }
    public String getQuestionTextThree(){
        driver.findElement(textThreeQuestion).getText();
        return driver.findElement(textThreeQuestion).getText();
    }
    public String getQuestionTextFore(){
        driver.findElement(textForeQuestion).getText();
        return driver.findElement(textForeQuestion).getText();
    }
    public String getQuestionTextFive(){
        driver.findElement(textFiveQuestion).getText();
        return driver.findElement(textFiveQuestion).getText();
    }

    public String getQuestionTextSix(){
        driver.findElement(textSixQuestion).getText();
        return driver.findElement(textSixQuestion).getText();
    }

    public String getQuestionTextSeven(){
        driver.findElement(textSevenQuestion).getText();
        return driver.findElement(textSevenQuestion).getText();
    }
    public String getQuestionTextEight(){
        driver.findElement(textEightQuestion).getText();
        return driver.findElement(textEightQuestion).getText();
    }



}
