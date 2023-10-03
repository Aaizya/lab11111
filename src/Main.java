import java.util.ArrayList;
public class Main {
    public static boolean checkAccessibility()
    {
        // Generate a random x coordinate
        Double x = (Math.floor(Math.random() * 2));

        if (x.equals(1.0))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        ShoppingApp app = ShoppingApp.getSomething();

        boolean connectivity = checkAccessibility();

        ArrayList<Product> products = app.doShopping(connectivity);


        if (connectivity)
            System.out.println("Internet is connected.Products list is fetched from Server:\n");
        else
            System.out.println("Internet is connected.Products list is fetched from Database:\n");

        for (int i = 0; i < products.size(); i++)
        {
            System.out.println("ID : " + products.get(i).getId());
            System.out.println("Name : " + products.get(i).getName());
            System.out.println("Price : " + products.get(i).getPrice());
            System.out.println("-------------------");
        }
    }
}