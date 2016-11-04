package FactoryMethod;

/**
 * Created by keagesil on 25/10/2016.
 */
abstract public class Creator {
    abstract public Product createProduct(String locale);
    abstract public Product createProduct();
}
