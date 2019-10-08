package com.hellofresh.challenge.createaccount;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateAccountPage extends PageObject {


  public static final By TITLE_FEMALE = By.id("id_gender2");
  public static final By ACC_CREATION_FORM = By.id("account-creation_form");
  public static final By FIRST_NAME_FIELD = By.id("customer_firstname");
  public static final By LAST_NAME_FIELD = By.id("customer_lastname");
  public static final By PASSWORD_FIELD = By.id("passwd");
  public static final By BIRTH_DAY = By.id("days");
  public static final By BIRTH_MONTH = By.id("months");
  public static final By BIRTH_YEAR = By.id("years");
  public static final By COMPANY_FIELD = By.id("company");
  public static final By ADDRESS1_FIELD = By.id("address1");
  public static final By ADDRESS2_FIELD = By.id("address2");
  public static final By CITY_FIELD = By.id("city");
  public static final By STATE_FIELD = By.id("id_state");
  public static final By ZIP_CODE_FIELD = By.id("postcode");
  public static final By OTHER_INFO_FIELD = By.id("other");
  public static final By HOME_PH_FIELD = By.id("phone");
  public static final By MOBILE_PH_FIELD = By.id("phone_mobile");
  public static final By ALIAS_FIELD = By.id("alias");
  public static final By REGISTER_BUTTON = By.id("submitAccount");
}
