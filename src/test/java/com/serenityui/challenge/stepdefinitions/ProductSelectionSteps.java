package com.serenityui.challenge.stepdefinitions;

import com.serenityui.challenge.account.AccountPageQuestions;
import com.serenityui.challenge.cart.CartPopUpActions;
import com.serenityui.challenge.homepage.HomePageActions;
import com.serenityui.challenge.navingation.NavigateActions;
import com.serenityui.challenge.productpage.ProductPageActions;
import com.serenityui.challenge.signin.SignInPageActions;
import cucumber.api.java.en.Given;
import java.util.List;
import java.util.Map;
import net.thucydides.core.annotations.Steps;

public class ProductSelectionSteps {

  @Steps
  NavigateActions navigateTo;

  @Steps
  HomePageActions homePageActions;

  @Steps
  CartPopUpActions cartPopUpActions;

  @Steps
  ProductPageActions productPageActions;

  @Steps
  SignInPageActions signInPageActions;

  @Steps
  AccountPageQuestions accountPageQuestions;

  @Given("Joe, an existing customer ordered:")
  public void existing_customer_ordered(List<Map<String, String>> products) {
    navigateTo.theSignInPage();
    signInPageActions.loginAsExistingUser();
    accountPageQuestions.verifyUserInAccountPage();

    //Add each product item to cart and proceed to checkout
    int itemCount = products.size();
    for (Map<String, String> product : products) {
      homePageActions.selectCategory(product.get("Section"));
      homePageActions.selectItem(product.get("Product"));
      productPageActions.addItemToCart();
      if (itemCount != 1) {
        cartPopUpActions.continueShopping();
        itemCount = itemCount-1;
      } else {
        cartPopUpActions.proceedToCheckout();
      }
    }
  }
}
