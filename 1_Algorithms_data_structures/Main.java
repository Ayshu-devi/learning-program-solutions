import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {
            "Laptop", "Smartphone", "Smartwatch", "Headphones", "Tablet", "Camera"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchTerm = scanner.nextLine();

        int index = ProductSearch.searchProduct(products, searchTerm);

        if (index != -1) {
            System.out.println("✅ Product '" + products[index] + "' found at index: " + index);
        } else {
            System.out.println("❌ Product not found.");
        }

        scanner.close();
    }
}
