package FactoryMethod;
import FactoryMethod.Creator;
import FactoryMethod.ConcreteCreator;
import FactoryMethod.Product;

/**
 * Created by keagesil on 25/10/2016.
 */
public final class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product pfr = creator.createProduct("FR");
        Product pen = creator.createProduct("GB");
        Product pde = creator.createProduct("DE");



        System.out.println(pfr.getName());
        System.out.println(pen.getName());
        System.out.println(pde.getName());

    }
}
