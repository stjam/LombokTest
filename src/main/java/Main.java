import lombok.extern.java.Log;
import pojos.Product;

/**
 * Created by root on 14.01.2016.
 */
@Log
public class Main {

    public static void main(String[] args) {
           log.fine("Start message...");

           Product product = new Product(1L, "Some name", "Description");
           //feature provided @Builder annotation
           final Product anotherProduct = Product.builder()
                   .id(2L)
                   .name("Another Some Name")
                   .description("Another Description").build();
           System.out.println(product.toString());
           System.out.println(anotherProduct.toString());
           log.fine("End message...");
    }
}
