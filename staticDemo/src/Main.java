public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 500;
        product.name = "Mouse";

        productManager.add(product);
    }
}
