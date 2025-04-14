package factory.method;

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();

    }
}

interface Factory{
    Product createProduct();
}

class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

interface Product{
    void info();
}

class ProductA implements Product{
    @Override
    public void info() {
        System.out.println("产品A");
    }
}

class ProductB implements Product{
    @Override
    public void info() {
        System.out.println("产品B");
    }
}