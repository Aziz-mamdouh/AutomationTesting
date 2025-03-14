package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyAssignLeave extends PageBase {

    By AssignLeaveButton =By.xpath("(//*[@href=\"#\"])[4]");
    By EmployeeName =By.xpath("//*[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]");
    By LeaveType =By.xpath("//*[contains(@class, 'oxd-select-text-input') and text()='-- Select --']");
    By selector =By.xpath("//*[contains(text(), 'CAN - Maternity')]");


    By AssignButton =By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");



    public ApplyAssignLeave(WebDriver driver) {
        super(driver);
    }
    public void clickOnLeaveButton(){
        clickOnElement(AssignLeaveButton);
    }
    public void fillEmployeeName(String EmployeeName){
        sendKeys(this.EmployeeName,EmployeeName);
    }
    public void LeaveTypeSelector(){
        clickOnElement(LeaveType);
    }
    public void selector(){
        clickOnElement(selector);
    }
    public void clickOnAssignButton() {
        clickOnElement(AssignButton);
    }
}
