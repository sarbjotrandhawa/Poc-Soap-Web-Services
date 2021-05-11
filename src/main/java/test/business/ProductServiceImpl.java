package test.business;

import java.util.ArrayList;
import java.util.List;

import test.Exceptions.MyException;
import test.model.Product;

public class ProductServiceImpl {

	List<Product> list = null;

	public ProductServiceImpl() {

		list = new ArrayList<>();
		list.add(new Product("Java", "123", 20.0));
		list.add(new Product("C++", "123", 20.0));
		list.add(new Product("Data Structure", "123", 20.0));
	}

	public boolean addProduct(Product product) throws MyException {
		if (product.getName().equals("") || product.getSku().equals("") || product.getPrice() == 0) {
			throw new MyException("Invalid product info", "product info is not avalialbe");
		} else {
			return list.add(product);
		}

	}

	public Product getProductDetail(String productname) {

		for (Product product : list) {
			if (product.getName().toLowerCase().equals(productname.toLowerCase())) {
				return product;
			}
		}

		return null;

	}

	public List<Product> getAllProducts() {
		return list;
	}

}
