package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginSteps {

    HomePage home;
    LoginPage login;
    ProfilePage profile;
    BettenPage betten;
    CartPage cart;

    @Given("User is on HomePage")
    public void is_on_HomePage() {
        home = open("https://www.sconto.de", HomePage.class);
//        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }

    @When("User clicks on Login icon")
    public void click_on_Login_icon() {
        home.clickOnLoginIcon();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData("mail@gm.com", "Qwer1234$");
    }

    @And("User clicks on Anmelden button")
    public void click_on_Anmelden() {
        login.clickOnAnmelden();
    }

    @And("User clicks on User status")
    public void click_On_User_status() {
        home = Selenide.page(HomePage.class);
        home.clickOnUserStatus();
    }

    @Then("User verifies his name is displayed")
    public void verify_User_name() {
        profile = Selenide.page(ProfilePage.class);
        profile.verifyUserName("Vladimir Ivanov");
    }

    @And("User navigates to product category")
    public void navigate_to_product_category() {
        home = Selenide.page(HomePage.class);
        betten = Selenide.page(BettenPage.class);
        betten.clickOnBetten();
    }

    @And("Select the first item in the list")
    public void select_the_first_item_in_the_list() {
        betten.clickTheFirstItem();
    }

    @And("Add the item to the cart")
    public void add_the_item_to_the_cart() {
        betten.addToTheCart();
        betten.typeZipcodeIfNeeded("13057");
    }

    @And("Go to the cart")
    public void go_to_the_cart() {
        cart = Selenide.page(CartPage.class);
        cart.goToCart();
    }

    @Then("Verify by text that the item is added")
    public void verify_item_is_added() {
        cart.verifyItemIsAdded("Boxbett Diablo");

    }
}
