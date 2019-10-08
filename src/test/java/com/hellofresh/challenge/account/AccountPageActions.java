package com.hellofresh.challenge.account;

import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class AccountPageActions extends UIInteractionSteps {

  AccountPage accountPage;

  public void createAccount() {
    Faker faker= new Faker();
    $(accountPage.EMAIL_FIELD).sendKeys(faker.internet().emailAddress());
    $(accountPage.CREATE_ACC_BUTTON).click();
  }
}
