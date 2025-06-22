
public class ProductSearch {
    public static int searchProduct(String[] products, String searchTerm) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        return -1;
    }
}
