package Assessment;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.BaseClassAssement;

public class SignUp extends BaseClassAssement {

    @Test(dataProvider = "signupData")
    public void signUp(String firstName, String lastName, String emailAddress, String password) throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/gettingStartedBtn")).click();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/affiliateSignUpBtn")).click();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/continueButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/affiliateSpinner")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[3]/android.widget.TextView")).click();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/firstNameEditText")).sendKeys(firstName);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/lastNameEditText")).sendKeys(lastName);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/emailAddressEditText")).sendKeys(emailAddress);

        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/passwordTextInputEditText")).click();
        driver.hideKeyboard();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/passwordTextInputEditText")).sendKeys(password);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/repasswordTextInputEditText")).sendKeys(password);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/signUpButton")).click();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/status_text")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        

        LoginPage loginPage = new LoginPage();
        loginPage.login(emailAddress, password);

       
    }


    @DataProvider(name = "signupData")
    public Object[][] getSignUpData() {
        
        return new Object[][] {
            {"Emmanuel", "Chuks", "Mannie@yopmail.com", "Pa$$word1"},
            
        };
    }
}
