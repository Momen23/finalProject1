package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class register {

    registerPage reg = new registerPage();
    SoftAssert soft = new SoftAssert();

    @Given("user go to register page")
    public void userGoToRegisterPage()
    {
        reg.registerIconTab.click();
    }

    @When("user Select gender type")
    public void userSelectGenderType() {
        reg.gender.click();
    }

    @And("user enter first and last name")
    public void userEnterFirstAndLastName() {
    reg.firstname.sendKeys("Momen");
    reg.lastName.sendKeys("Ahmed");
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {

        //Selecting Day
        int minDay = 1;
        int maxDay = 31;
        int randomDay = (int)Math.floor(Math.random() * (maxDay - minDay + 1) + minDay);

        WebElement DateOfBirthDay = reg.dateOfBirthDay;
        Select staticList = new Select(reg.dateOfBirthDay);
        staticList.selectByIndex(randomDay);

        //Selecting Month
        int minMonth = 1;
        int maxMonth = 12;
        int randomMonth = (int)Math.floor(Math.random() * (maxMonth - minMonth + 1) + minMonth);

        WebElement DateOfBirthMonth = reg.dateOfBirthMonth;
        Select staticListMonth = new Select(reg.dateOfBirthMonth);
        staticListMonth.selectByIndex(randomMonth);

        //Selecting Year
        int minYear = 1;
        int maxYear = 111;
        int randomYear = (int)Math.floor(Math.random() * (maxYear - minYear + 1) + minYear);

        WebElement DateOfBirthYear = reg.dateOfBirthYear;
        Select staticListYear = new Select(reg.dateOfBirthYear);
        staticListYear.selectByIndex(randomYear);
    }

    @And("user enter valid email")
    public void userEnterValidEmail() {

        Faker fake = new Faker();
        String email = fake.internet().safeEmailAddress();
        reg.email.sendKeys(email);
        configReader.set("email",email);
    }

    @And("user enter password and confirm password")
    public void userEnterPasswordAndConfirmPassword() {

        Faker fake = new Faker();
        String password = fake.internet().password();
        configReader.set("password",password);

        reg.password.sendKeys(password);
        reg.confirmPassword.sendKeys(password);
    }

    @And("user click on register Button")
    public void userClickOnRegisterButton() {

        reg.registerBtn.click();
    }

    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {

        soft.assertEquals(reg.result.getText(),"Your registration completed");


        // color of the text is green
        reg.result.getCssValue("color");
        System.out.println(reg.result.getCssValue("color"));
        soft.assertEquals(reg.result.getCssValue("color"),"rgba(76, 177, 124, 1)");

        // Continue Btn is displayed
        soft.assertEquals(reg.continueBtn.isDisplayed(), true);


        soft.assertAll();
    }
}
