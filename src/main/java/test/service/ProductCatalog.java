package test.service;

import java.util.List;


import javax.jws.WebResult;
import javax.jws.WebService;

import test.Exceptions.MyException;
import test.business.ProductServiceImpl;
import test.model.Product;

@WebService(endpointInterface = "test.service.ProductCatalogInterface", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	@Override
	@WebResult(name = "Product")
	public List<Product> getProductCategories() {
		return productServiceImpl.getAllProducts();
	}

	@Override
	public boolean addProduct(String name, String sku, double price) throws MyException {
		return productServiceImpl.addProduct(new Product(name, sku, price));
	}

	@Override
	public Product getProductDetail(String productname) {
		return productServiceImpl.getProductDetail(productname);
	}
}
