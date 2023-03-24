package domain;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addCartItem(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }
}
