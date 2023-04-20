package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());


}