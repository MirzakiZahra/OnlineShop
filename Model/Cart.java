package Model;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList = new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
