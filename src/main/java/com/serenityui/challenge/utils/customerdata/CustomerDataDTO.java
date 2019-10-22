package com.serenityui.challenge.utils.customerdata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO to get and set random customer data
 */
@Getter
@Setter
@ToString
public class CustomerDataDTO {
  String firstName;
  String LastName;
  String emailId;
  String password;
  String birthday;
  String birthMonth;
  String birthYear;
  String companyName;
  String address1;
  String address2;
  String city;
  String state;
  String zipCode;
  String otherInfo;
  String homeNo;
  String mobileNo;
  String alias;
}
