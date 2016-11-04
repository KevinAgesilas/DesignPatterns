package FactoryMethod;

import java.util.Locale;

/**
 * Created by keagesil on 25/10/2016.
 */
public class ConcreteCreator extends Creator {
    public Product createProduct(String locale)
    {
        switch(locale)
        {
            case "FR":
                return new ConcreteProductFR();

            case "GB":
                return new ConcreteProductEN();

            case "US":
                return new ConcreteProductEN();

            case "DE":
                return new ConcreteProductDE();

            default:
                return null;
        }
    }

    @Override
    public Product createProduct()
    {
        Locale local = Locale.getDefault();
        switch(local.getCountry())
        {
            case "FR":
                return new ConcreteProductFR();

            case "GB":
                return new ConcreteProductEN();

            case "US":
                return new ConcreteProductEN();

            case "DE":
                return new ConcreteProductDE();

            default:
                return null;
        }
    }
}
