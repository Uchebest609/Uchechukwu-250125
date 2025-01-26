package Assessment;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class LoginPage extends SignUp {

    public void login(String emailAddress, String password) throws MalformedURLException, InterruptedException {
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/loginBtn")).click();
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/email_input")).sendKeys(emailAddress);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/password_input")).sendKeys(password);
        driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/loginBtn")).click();
        Thread.sleep(9000);
    }
}
