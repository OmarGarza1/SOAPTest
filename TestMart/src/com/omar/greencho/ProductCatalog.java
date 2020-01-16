package com.omar.greencho;

import java.util.List;

import javax.jws.WebService;

import com.omar.greencho.business.ProductServiceImpl;
import com.omar.greencho.model.Product;

@WebService(endpointInterface = "com.omar.greencho.ProductCatalogInterface" , portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService", targetNamespace = "http://www.greencho.com")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();

	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

}
