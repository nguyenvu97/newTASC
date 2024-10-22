package pattern.factorymethod;


import java.util.Scanner;

public class FactoryMethod {
    public Product getProduct(ProductType productType) {
        Product product = null;
      switch (productType) {
                case BLUE :
                    product = new ProductA();
                    return product;

                case YELLOW :
                    product = new ProductB();
                    return product;
      }

      return product;
    }

    public static void main(String[] args) {
       Product product ;
       FactoryMethod factoryMethod = new FactoryMethod();
        Scanner scanner = new Scanner(System.in);
        String product1 = scanner.nextLine();
       if (product1.equalsIgnoreCase("Blue")) {
           product = factoryMethod.getProduct(ProductType.BLUE);
       }else {
           product = factoryMethod.getProduct(ProductType.YELLOW);
       }
        System.out.println(product.getProduct());

    }
}
