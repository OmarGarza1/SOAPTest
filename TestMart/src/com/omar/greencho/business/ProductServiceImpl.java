package com.omar.greencho.business;

import java.util.ArrayList;
import java.util.List;

import com.omar.greencho.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Coco");
		bookList.add("Miau");

		musicList.add("Cirlce");
		musicList.add("Luna");
		musicList.add("Chacha");

		moviesList.add("Zombies");
		moviesList.add("Aliens");
		moviesList.add("Cats");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;

		case "music":
			return musicList;

		case "movies":
			return moviesList;

		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;

		case "music":
			musicList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;

		default:
			return false;

		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Greencho", "1234", 12.0));
		productList.add(new Product("Miau", "ABC", 15.0));
		return productList;
	}

}
