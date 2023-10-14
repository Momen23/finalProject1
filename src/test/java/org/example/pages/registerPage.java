package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends pageBase{

    @FindBy(className = "ico-register")
    public WebElement registerIconTab;


    @FindBy(id="FirstName")
    public WebElement firstname;

    @FindBy(id= "gender-female")
    public WebElement gender;

    @FindBy(id="LastName")
    public  WebElement lastName;

    @FindBy(name="DateOfBirthDay")
    public  WebElement dateOfBirthDay;

    @FindBy(name="DateOfBirthMonth")
    public WebElement dateOfBirthMonth;

    @FindBy(name="DateOfBirthYear")
    public WebElement dateOfBirthYear;

    @FindBy(id="Email")
    public  WebElement email;

    @FindBy(id="Company")
    public  WebElement company;

    @FindBy(id="Newsletter")
    public WebElement newsLetter;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id="register-button")
    public WebElement registerBtn;

    @FindBy(className = "result")
    public WebElement result;

    @FindBy(css = "div[class=\"buttons\"]>a[class=\"button-1 register-continue-button\"]")
    public WebElement continueBtn;

    @FindBy(id = "Email-error")
    public WebElement errorMsg;
}
