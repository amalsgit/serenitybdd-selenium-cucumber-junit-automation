package com.serenityui.challenge.utils.testdata;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO to get and set values read from test data yaml file
 */
@Getter
@Setter
public class TestDataDTO {

  private String userEmail;
  private String userPassword;
  private String userName;
}
