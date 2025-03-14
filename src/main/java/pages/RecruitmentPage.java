package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage extends PageBase{

    By RecruitmentButton = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[5]");
    By AddButton = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    By FirstName = By.xpath("//*[@class=\"oxd-input oxd-input--active oxd-input--error orangehrm-firstname\"]");
    By MiddleName = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]");
    By LastName = By.xpath("//*[@class=\"oxd-input oxd-input--active oxd-input--error orangehrm-lastname\"]");
    By Email = By.xpath("//*[@class=\"oxd-input oxd-input--active oxd-input--error\"]");
    By SaveButton = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnRecruitmentButton() {
        clickOnElement(RecruitmentButton);
    }
    public void clickOnAddButton() {
        clickOnElement(AddButton);
    }
    public void fillFirstname(String firstname) {
     sendKeys(FirstName,firstname);
    }
    public void fillMiddlename(String middlename) {
        sendKeys(MiddleName,middlename);
    }
    public void fillLastname(String lastname) {
        sendKeys(LastName,lastname);
    }
    public void fillEmail(String email) {
        sendKeys(Email,email);
    }
    public void clickOnSavetButton() {
        clickOnElement(SaveButton);
    }

}
