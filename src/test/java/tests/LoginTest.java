package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class LoginTest extends TestBase {

    LoginPage loginpage;
    DashboardPage dashboardPage;
    ApplyLeave applyLeave;
    ApplyAssignLeave assignLeave;
    RecruitmentPage recruitmentPage;

    @BeforeMethod
    public void init() {
        loginpage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        applyLeave = new ApplyLeave(driver);
        assignLeave=new ApplyAssignLeave(driver);
        recruitmentPage=new RecruitmentPage(driver);
    }

    @Test
    public void LoginWithValidUsernameAndValidPassword() throws InterruptedException {
        System.out.println(driver);
        loginpage.fillUserName("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickOnLoginButton();
        Thread.sleep(3000);

        Assert.assertEquals(dashboardPage.ActualResultAssert(), dashboardPage.dashboardText);

        recruitmentPage.clickOnRecruitmentButton();
        Thread.sleep(3000);
        recruitmentPage.clickOnAddButton();
        Thread.sleep(3000);
        recruitmentPage.fillFirstname("Aziz");
        Thread.sleep(3000);
        recruitmentPage.fillMiddlename("Mamdouh");
        Thread.sleep(3000);
        recruitmentPage.fillLastname("Aziz");
        Thread.sleep(3000);
        recruitmentPage.fillEmail("ahmed@gmail.com");
        Thread.sleep(3000);
         recruitmentPage.clickOnSavetButton();




  //  }
  //  @Test
  //  public void ApplyTest() throws InterruptedException {
//        applyLeave.clickOnLeaveButton();
//        applyLeave.clickOnApplyButton();
//        Thread.sleep(3000);
//
//        assignLeave.clickOnLeaveButton();
//        Thread.sleep(5000);
//        assignLeave.LeaveTypeSelector();
//      //  assignLeave.selector();
//        //assignLeave.fillEmployeeName("Aziz Mamdouh");
//
//        Thread.sleep(7000);
//        assignLeave.clickOnAssignButton();
    }

}
