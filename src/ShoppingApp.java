import java.util.ArrayList;
public class ShoppingApp
{
    Strategy strategy;

    //-----------Singleton Design--------------------//
    private static ShoppingApp obj;

    private ShoppingApp(){}

    public static ShoppingApp getSomething()
    {
        if (obj == null)
            obj = new ShoppingApp();

        return obj;
    }

    public ArrayList<Product> doShopping(boolean connectivity)
    {
        if (connectivity)
            strategy = NetworkManager.getSomething();
        else
            strategy = DatabaseManager.getSomething();

        return strategy.getProductsList();
    }
}