package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement verifyUserName(String name) {
        return $(".titleHeadline").shouldHave(text(name));
    }
}
