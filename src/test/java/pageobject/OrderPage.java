package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;

public class OrderPage extends BaseSeleniumPage {

    //кнопка "Заказать"
    private By orderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    //нижняя кнопка "Заказать"
    private By downOrderButton = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //поле для ввода имени
    private By fieldName = By.xpath("//input[@placeholder= '* Имя']");
    //поле для ввода фамилии
    private By fieldLasteName = By.xpath("//input[@placeholder= '* Фамилия']");
    //поле для ввода адреса доставки
    private By fieldAdress = By.xpath("//input[@placeholder= '* Адрес: куда привезти заказ']");
    //поле для ввода станции метро
    private By fieldStationMetro = By.xpath("//input[@class= 'select-search__input']");

    //станция метро 1
    private By stationMetroOne = By.xpath("//div[text() ='Бульвар Рокоссовского']");

    //станция метро 2
    private By stationMetroTwo = By.xpath("//div[text() ='Черкизовская']");
    //поле для ввода номера телефона
    private By fieldNumberPhone = By.xpath("//input[@placeholder= '* Телефон: на него позвонит курьер']");
    //конпа "Далее"
    private By buttonNext = By.xpath("//button[text() = 'Далее']");

    //поле "Когда привезти заказ"
    private By fieldWhereSendSamokat = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //поле "Срок аренды"
    private By dropeListTimeRent = By.xpath("//div[@class='Dropdown-control']");
    private By timeRent = By.xpath("//div[@class='Dropdown-option' and text() = 'двое суток']");
    //поле цвета самоката
    private By chooseColorSamokatBlack = By.xpath("//input[@id= 'black']");
    private By chooseColorSamokatGrey = By.xpath("//input[@id= 'grey']");
    //поле для написания комментария
    private By fieldCommentForDelivery = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //кнопка "Заказать"
    private By buttonCreateOrder = By.xpath("//button[text()='Заказать' and @class='Button_Button__ra12g Button_Middle__1CSJM']");

    //кнопка "Да", подтверждение закаказа
    private By yesOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //текст в сформированном заказе
    private By textByOrder = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");


    //методы для работы с объектами страницы
    public void clickButtonOrder () {
        driver.findElement(orderButton).click();
    }

    public void clickDownButtonOrder(){
        WebElement element = driver.findElement(downOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(downOrderButton).click();
    }

    public void setFieldName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    public void setFieldLasteName(String lasteName) {
        driver.findElement(fieldLasteName).sendKeys(lasteName);
    }

    public void setAdress(String adress){
        driver.findElement(fieldAdress).sendKeys(adress);
    }

    public void clicktStationMetro(){
        driver.findElement(fieldStationMetro).click();
    }

    public void setStationMetro(){
        driver.findElement(stationMetroOne).click();
    }

    public void setStationMetroTwo(){
        driver.findElement(stationMetroTwo).click();
    }

    public void setNumberPhone(String number){
        driver.findElement(fieldNumberPhone).sendKeys(number);
    }

    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }

    public void setWhereSendSamokat(String dateSend){
        driver.findElement(fieldWhereSendSamokat).sendKeys(dateSend);
        driver.findElement(fieldWhereSendSamokat).sendKeys(Keys.ENTER);
    }

    public void clickTimeRent(){
        driver.findElement(dropeListTimeRent).click();
    }
    public void setTimeRent(){
        driver.findElement(timeRent).click();
    }

    public void setColorSamokat(){
        driver.findElement(chooseColorSamokatBlack).click();
    }

    public void setChooseColorSamokatGrey(){
        driver.findElement(chooseColorSamokatGrey).click();
    }

    public void setCommentForDelivery(String comment){
        driver.findElement(fieldCommentForDelivery).sendKeys(comment);
    }

    public void clickCreateOrder(){
        driver.findElement(buttonCreateOrder).click();
    }

    public void clickAcceptOrder(){
        driver.findElement(yesOrder).click();
    }

    public String getOrderText(){
        driver.findElement(textByOrder).getText();
        return driver.findElement(textByOrder).getText();
    }


}

