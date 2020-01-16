package com.omar.greencho;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.omar.greencho.model.Product;

@WebService(name = "TestMartCatalog")
public interface ProductCatalogInterface {

	@WebMethod(action = "getch_categories", operationName = "fetchCategories")
	List<String> getProductCategories();

	List<String> getProducts(String category);

	@WebResult(name = "Product")
	List<Product> getProductsv2(String category);

	@WebMethod(exclude = true)
	boolean addProduct(String category, String product);

}