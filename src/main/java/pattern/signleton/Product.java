package pattern.signleton;

public class Product {
    private String name;
    private int price;
    private static Product product;

    private Product(String name,int price) {
        this.price = price;
        this.name = name;
    }

    public static Product getProduct(String name , int price) {
        if (product == null) {
           synchronized (Product.class) {
               if (product == null) {
                   product = new Product(name,price);
               }
           }
        }
        return product;
    }
    public  void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product product1 = Product.getProduct("string",200);

        product1.display();


        Product proudct2 = Product.getProduct("string",300);

        proudct2.display();
    }
}



