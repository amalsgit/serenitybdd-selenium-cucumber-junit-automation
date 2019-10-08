package com.hellofresh.challenge.createaccount;

import com.github.javafaker.Faker;
import java.util.Locale;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageActions extends UIInteractionSteps {


  CreateAccountPage createAccountPage;

  @Step
  public void createAccount() {
    Faker fake = new Faker();
    String userFirstName=fake.name().firstName();
    String userLastName=fake.name().lastName();
    String userFullName=userFirstName+" "+userLastName;


    Serenity.setSessionVariable("New User Name").to(userFullName);

    $(createAccountPage.TITLE_FEMALE).click();
    $(createAccountPage.FIRST_NAME_FIELD).sendKeys(userFirstName);
    $(createAccountPage.LAST_NAME_FIELD).sendKeys(userLastName);
    $(createAccountPage.PASSWORD_FIELD).sendKeys(fake.number().digits(8));

    String birthDay = Integer.toString(fake.number().numberBetween(1, 28));
    Select day = new Select(find(createAccountPage.BIRTH_DAY));
    day.selectByValue(birthDay);

    String birthMonth = Integer.toString(fake.number().numberBetween(1, 12));
    Select month = new Select(find(createAccountPage.BIRTH_MONTH));
    month.selectByValue(birthMonth);

    String birthYear = Integer.toString(fake.number().numberBetween(1980, 2000));
    Select year = new Select(find(createAccountPage.BIRTH_YEAR));
    year.selectByValue(birthYear);

    $(createAccountPage.COMPANY_FIELD).sendKeys(fake.name().name());
    $(createAccountPage.ADDRESS1_FIELD).sendKeys(fake.address().streetAddress());
    $(createAccountPage.ADDRESS2_FIELD).sendKeys(fake.address().secondaryAddress());
    $(createAccountPage.CITY_FIELD).sendKeys(fake.address().city());

    String stateName = Integer.toString(fake.number().numberBetween(1, 10));
    Select state = new Select(find(createAccountPage.STATE_FIELD));
    state.selectByValue(stateName);

    $(createAccountPage.ZIP_CODE_FIELD).sendKeys(fake.number().digits(5));
    $(createAccountPage.OTHER_INFO_FIELD).sendKeys(fake.gameOfThrones().house());
    $(createAccountPage.HOME_PH_FIELD).sendKeys(fake.phoneNumber().cellPhone());
    $(createAccountPage.MOBILE_PH_FIELD).sendKeys(fake.phoneNumber().cellPhone());
    $(createAccountPage.ALIAS_FIELD).sendKeys("HF Challenge");
    $(createAccountPage.REGISTER_BUTTON).click();
  }
}
