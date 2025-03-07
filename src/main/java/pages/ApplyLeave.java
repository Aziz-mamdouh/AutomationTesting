
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ApplyLeave extends PageBase{

    By leaveButton = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']");
    By ApplyButton = By.xpath("//a[contains(@class, 'oxd-topbar-body-nav-tab-item') and text()='Apply']");

    public ApplyLeave(WebDriver driver) {
        super(driver);
    }
    public void clickOnLeaveButton(){
        clickOnElement(leaveButton);
    }
   public void clickOnApplyButton(){
        clickOnElement(ApplyButton);
   }
}
