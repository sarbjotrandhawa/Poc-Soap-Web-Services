package test.service;
import javax.xml.ws.Endpoint;


public class TestMartPublisher {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:8082/productcatalog", new ProductCatalog());
	}

}
