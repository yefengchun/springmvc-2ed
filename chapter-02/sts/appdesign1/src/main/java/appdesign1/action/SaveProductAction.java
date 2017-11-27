package appdesign1.action;

import appdesign1.model.Product;


public class SaveProductAction {
	public void save(Product product) {
		// insert Product to the database
		System.out.println("saved " + product.getName() + "\t" + new java.util.Date());
	}
}
