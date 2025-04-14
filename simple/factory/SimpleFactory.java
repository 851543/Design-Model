package simple.factory;

public class SimpleFactory {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        productA.info();

        Product productB = Factory.createProduct("B");
        productB.info();
    }
}

class Factory {
    public static Product createProduct(String type) {
        Product product = null;

        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("没有" + type + "产品");
        }

        return product;
    }
}