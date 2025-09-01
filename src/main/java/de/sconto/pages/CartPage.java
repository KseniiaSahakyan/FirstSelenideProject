package de.sconto.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public CartPage goToCart() {
        $("a[data-testid='headerBrandCart']").click();
        return Selenide.page(this);
    }

    public CartPage verifyItemIsAdded(String articletext) {
        $("a.cartEntry__articleLink").shouldHave(text(articletext));
        return this;
    }


}
