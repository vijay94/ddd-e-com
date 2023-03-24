import domain.Cart;
import domain.CartItem;
import domain.Product;

public class Main {
    public static void main(String[] args) {
        Product applePencil = new Product("Apple Pencil");
        Product sonyHeadSet = new Product("Sony Wireless headphone");
        Cart cart = new Cart();
        CartItem applePencilItem = new CartItem(applePencil, 2);
        CartItem sonyHeadPhoneItem = new CartItem(sonyHeadSet, 1);
        cart.addCartItem(applePencilItem);
        cart.addCartItem(sonyHeadPhoneItem);
    }
}