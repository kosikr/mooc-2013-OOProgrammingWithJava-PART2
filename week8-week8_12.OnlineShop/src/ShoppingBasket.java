
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            this.basket.put(product, purchase);
        }
    }

    public int price() {
        int helper = 0;
        for (Purchase purchase : this.basket.values()) {
            helper += purchase.price();
        }
        return helper;
    }

    public void print() {
        for (Purchase purchase : this.basket.values()) {
            System.out.println(purchase);
        }
    }
}
