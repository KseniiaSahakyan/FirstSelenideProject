package de.sconto.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class BettenPage {
    public BettenPage clickOnBetten() {
        $("//strong[text()='Betten']").click();
        return Selenide.page(this);
    }

    public BettenPage clickTheFirstItem() {
        $("a.sc-1jwor9w-1.fayiLC").click();
        return Selenide.page(this);
    }

    public BettenPage addToTheCart() {
        $("button[data-testid='addToCartButton']").click();
        return Selenide.page(this);
    }

    public BettenPage typeZipcodeIfNeeded(String zipcode) {
        if ($("div[data-testid='overlayContent']").exists()) {
            $("#zipCode").setValue(zipcode);
            $("button.sc-1y25p9l-0.sc-u8dlcr-0.hebMoR.cOMHGx").click();
        }
        return this;
    }
}


