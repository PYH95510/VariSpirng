package thinkoutloud.firstproject.service;

import thinkoutloud.firstproject.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);

}
