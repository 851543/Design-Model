package prototype;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2022,5.28);
        System.out.println(product1.getId()+ " " + product1.getPrice());
        Product product2 = (Product) product1.Chlone();
        System.out.println(product2.getId()+ " " + product2.getPrice());
    }
}

interface Prototype{
    Object Chlone();
}

class Product implements Prototype{

    private int id;
    private double price;

    public Product() {}

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Object Chlone() {
        Product product = new Product();
        product.id = this.id;
        product.price = this.price;
        return product;
    }
}