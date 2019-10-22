package com.serenityui.challenge.homepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

  static final String PRODUCT = "//a[@title='{0}' and @class='product-name']";
  static final String SECTION = "//a[text()='{0}']";
}
