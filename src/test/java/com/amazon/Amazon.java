package com.amazon;

import com.amazon.pages.Cart;
import com.amazon.pages.Home;

public class Amazon {
    public Home home;
    public Cart cart;
    public Amazon() {
        home = new Home();
        cart = new Cart();
    }
}
