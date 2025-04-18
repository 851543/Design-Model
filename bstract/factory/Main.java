package bstract.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        ProductA productA1 = factory1.createProductA();
        productA1.info();
        ProductB productB1 = factory1.createProductB();
        productB1.info();
        Factory factory2 = new Factory2();
        ProductA productA2 = factory2.createProductA();
        productA2.info();
        ProductB productB2 = factory2.createProductB();
        productB2.info();
    }
}

interface Factory{
    ProductA createProductA();
    ProductB createProductB();
}

class Factory1 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}

class Factory2 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}

interface ProductA{
    void info();
}

interface ProductB{
    void info();
}

class ProductA1 implements ProductA{
    @Override
    public void info() {
        System.out.println("产品A1");
    }
}

class ProductB1 implements ProductB{
    @Override
    public void info() {
        System.out.println("产品B1");
    }
}

class ProductA2 implements ProductA{
    @Override
    public void info() {
        System.out.println("产品A2");
    }
}

class ProductB2 implements ProductB{
    @Override
    public void info() {
        System.out.println("产品B2");
    }
}