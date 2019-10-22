package com.serenityui.challenge.utils.customerdata;

import com.github.javafaker.Faker;

/**
 * Generate random customer data using Faker library
 */
public class CustomDataGenerator {

  public static CustomerDataDTO customerDataDTO = new CustomerDataDTO();

  static {
    Faker fake = new Faker();
    customerDataDTO.setFirstName("Matt");
    customerDataDTO.setLastName(fake.name().lastName());
    customerDataDTO.setEmailId(fake.internet().emailAddress());
    customerDataDTO.setPassword(fake.number().digits(8));
    customerDataDTO.setBirthday(Integer.toString(fake.number().numberBetween(1, 28)));
    customerDataDTO.setBirthMonth(Integer.toString(fake.number().numberBetween(1, 12)));
    customerDataDTO.setBirthYear(Integer.toString(fake.number().numberBetween(1980, 2000)));
    customerDataDTO.setCompanyName(fake.name().name());
    customerDataDTO.setAddress1(fake.address().streetAddress());
    customerDataDTO.setAddress2(fake.address().secondaryAddress());
    customerDataDTO.setCity(fake.address().city());
    customerDataDTO.setState(Integer.toString(fake.number().numberBetween(1, 10)));
    customerDataDTO.setZipCode(fake.number().digits(5));
    customerDataDTO.setOtherInfo(fake.gameOfThrones().house());
    customerDataDTO.setMobileNo(fake.phoneNumber().cellPhone());
    customerDataDTO.setHomeNo(fake.phoneNumber().cellPhone());
    customerDataDTO.setAlias("HF Challenge");
  }
}
