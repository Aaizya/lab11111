public class Product
{
    private int id;
    private String name;
    private int price;

    public Product(int i, String n, int p)
    {
        this.id = i;
        this.name = n;
        this.price = p;
    }

    public int getId()
    {
        return id;
    }

    public int getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }
}