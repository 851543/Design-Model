package simple.factory;

abstract class Product {
    public abstract void info();
}

class ProductA extends Product {
    @Override
    public void info() {
        System.out.println("产品A");
    }
}

class ProductB extends Product {
    @Override
    public void info() {
        System.out.println("产品B");
    }
}