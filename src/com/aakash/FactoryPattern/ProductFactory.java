package com.aakash.FactoryPattern;

public class ProductFactory{
	public Product createProduct(String ProductID){
		if (ProductID.equals("1"))
			return new ProductOne();
		if (ProductID.equals("2")) 
			return new ProductTwo();
		
        return null; //if the id doesn't have any of the expected values
    }
    /*
     * This implementation is the most simple and intuitive (Let's call it noob implementation). 
     * The problem here is that once we add a new concrete product call we should modify the Factory class. 
     * It is not very flexible and it violates open close principle. 
     * Of course we can subclass the factory class, 
     * but let's not forget that the factory class is usually used as a singleton. 
     * Subclassing it means replacing all the factory class references everywhere through the code.
     * */
}
