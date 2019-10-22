package com.serenityui.challenge.createaccount;

import static com.serenityui.challenge.utils.customerdata.CustomDataGenerator.customerDataDTO;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageActions extends UIInteractionSteps {

  @Step("Fill user details and create account")
  public void createAccount() {

    $(CreateAccountPage.TITLE_FEMALE).click();
    $(CreateAccountPage.FIRST_NAME_FIELD).sendKeys(customerDataDTO.getFirstName());
    $(CreateAccountPage.LAST_NAME_FIELD).sendKeys(customerDataDTO.getLastName());
    $(CreateAccountPage.PASSWORD_FIELD).sendKeys(customerDataDTO.getPassword());

    Select day = new Select(find(CreateAccountPage.BIRTH_DAY));
    day.selectByValue(customerDataDTO.getBirthday());

    Select month = new Select(find(CreateAccountPage.BIRTH_MONTH));
    month.selectByValue(customerDataDTO.getBirthMonth());

    Select year = new Select(find(CreateAccountPage.BIRTH_YEAR));
    year.selectByValue(customerDataDTO.getBirthYear());

    $(CreateAccountPage.COMPANY_FIELD).sendKeys(customerDataDTO.getCompanyName());
    $(CreateAccountPage.ADDRESS1_FIELD).sendKeys(customerDataDTO.getAddress1());
    $(CreateAccountPage.ADDRESS2_FIELD).sendKeys(customerDataDTO.getAddress2());
    $(CreateAccountPage.CITY_FIELD).sendKeys(customerDataDTO.getCity());

    Select state = new Select(find(CreateAccountPage.STATE_FIELD));
    state.selectByValue(customerDataDTO.getState());

    $(CreateAccountPage.ZIP_CODE_FIELD).sendKeys(customerDataDTO.getZipCode());
    $(CreateAccountPage.OTHER_INFO_FIELD).sendKeys(customerDataDTO.getOtherInfo());
    $(CreateAccountPage.HOME_PH_FIELD).sendKeys(customerDataDTO.getHomeNo());
    $(CreateAccountPage.MOBILE_PH_FIELD).sendKeys(customerDataDTO.getMobileNo());
    $(CreateAccountPage.ALIAS_FIELD).sendKeys(customerDataDTO.getAlias());
    $(CreateAccountPage.REGISTER_BUTTON).click();
  }
}
