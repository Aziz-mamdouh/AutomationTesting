package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ApplyLeave;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends TestBase{

    LoginPage loginpage;
    DashboardPage dashboardPage;
    ApplyLeave applyLeave ;
    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void LoginWithValidUsernameAndValidPassword() throws InterruptedException {
        System.out.println(driver);
        loginpage.fillUserName("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickOnLoginButton();
        Thread.sleep(3000);
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.dashboardText);


        applyLeave.clickOnLeaveButton();
        applyLeave.clickOnApplyButton();
        Thread.sleep(3000);
    }

}
