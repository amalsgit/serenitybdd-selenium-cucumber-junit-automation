package com.serenityui.challenge.account;

import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class AccountPageActions extends UIInteractionSteps {

  @Step("Proceed to create account after providing email id")
  public void createAccount() {
    Faker faker= new Faker();
    $(AccountPage.EMAIL_FIELD).sendKeys(faker.internet().emailAddress());
    $(AccountPage.CREATE_ACC_BUTTON).click();
  }
}
