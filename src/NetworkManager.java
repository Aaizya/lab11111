import java.util.ArrayList;
public class NetworkManager implements Strategy
{
    private static NetworkManager obj;

    private NetworkManager(){}

    public static NetworkManager getSomething()
    {
        if (obj == null)
            obj = new NetworkManager();

        return obj;
    }

    @Override
    public ArrayList<Product> getProductsList()
    {
        ArrayList<Product> products = new ArrayList();

        products.add(new Product(1,"TV",1000));
        products.add(new Product(2,"washing machine",20000));
        products.add(new Product(3,"Microwave",3000));

        return products;
    }
}