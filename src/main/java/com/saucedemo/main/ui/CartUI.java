package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {

    public static final Target ITEM_ON_CART_TEXT = Target.the("Item t-shirt red").locatedBy("//div[@class='inventory_item_name']");

    public static final Target BTN_CHECK = Target.the("Boton del check").locatedBy("//button[@class='btn btn_action btn_medium checkout_button']");

}
