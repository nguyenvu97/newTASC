package pattern.factorymethod;

public class ProductB implements Product {
    @Override
    public Integer getProduct() {
        System.out.println("product B");
        return 10;
    }
}
