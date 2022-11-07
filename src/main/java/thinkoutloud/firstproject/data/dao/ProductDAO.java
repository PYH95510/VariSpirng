package thinkoutloud.firstproject.data.dao;

import thinkoutloud.firstproject.data.entity.Product;

public interface ProductDAO {

    Product saveProduct(Product product);

    Product getProduct(String productId);

}
