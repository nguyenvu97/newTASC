package pattern.signleton;

import pattern.factorymethod.Product;

import java.lang.reflect.Field;

public enum ProductA  implements Product  {
    INSTANCE();
    
    private int price;
    private String name;
    ProductA() {
        this.price = 0;
        this.name = "Default Product";
    }

    public void setProductDetails(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    @Override
    public Object getProduct() {
        return "String enum";
    }




    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ProductA productA = ProductA.INSTANCE;
        productA.setProductDetails(10, "Silver");
        productA.display();

        ProductA productB = ProductA.INSTANCE;
        Field field = productB.getClass().getDeclaredField("price");
        field.setAccessible(true);
        field.set(productB, 20);

        int value = (int) field.get(productB);
        System.out.println("Value: " + value);
        System.out.println(productA.getProduct());




    }

}
