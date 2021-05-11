package test.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import test.Exceptions.MyException;
import test.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_categories", operationName = "fetchAllProducts")
	List<Product> getProductCategories();

	@WebMethod
	boolean addProduct(String name, String sku, double price) throws MyException;

	@WebMethod
	Product getProductDetail(String productname);

}