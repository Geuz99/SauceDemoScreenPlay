package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target TEXT_VALID = Target.the("El cliente visualiza la pagina de productos").locatedBy("//span[@class='title']");
    public static final Target SELECT_FILTER  = Target.the("Selector de fitros").locatedBy("//select[@class='product_sort_container']");
    public static final Target OPTION_LOHI_FILTER = Target.the("Opcion lo-hi").locatedBy("//option[@value='lohi']");

    public static final Target TEXT_VALID_FILTER = Target.the("El cliente visualiza los productos filtrados").locatedBy("//span[@class='active_option']");
    public static final Target  BTN_ADD_ITEM_TSHIRTRED = Target.the("Item t-shirt red").locatedBy("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");

    public static final Target  BTN_CART = Target.the("Boton de ir al carrito").locatedBy("//a[@class='shopping_cart_link']");

}