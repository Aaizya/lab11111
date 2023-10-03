
import java.util.ArrayList;
public class DatabaseManager implements Strategy
{
    private static DatabaseManager obj;

    private DatabaseManager(){}

    public static DatabaseManager getSomething()
    {
        if (obj == null)
            obj = new DatabaseManager();

        return obj;
    }
    @Override
    public ArrayList<Product> getProductsList()
    {
        ArrayList<Product> products = new ArrayList();

        products.add(new Product(10,"Phone",50000));
        products.add(new Product(11,"Computer",60000));
        products.add(new Product(12,"laptop",70000));

        return products;
    }
}