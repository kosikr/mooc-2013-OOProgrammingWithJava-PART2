
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.get(product) == null) {
            return -99;
        }
        return this.prices.get(product);
    }

    public int stock(String product) {
        if (this.stock.get(product) == null) {
            return 0;
        }
        return this.stock.get(product);
    }

    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            if (this.stock.get(product) > 0) {
                int helper = this.stock.get(product) - 1;
                this.stock.put(product, helper);
                return true;
            }

        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for (String key : this.prices.keySet()) {
            set.add(key);
        }
        return set;
    }
}
