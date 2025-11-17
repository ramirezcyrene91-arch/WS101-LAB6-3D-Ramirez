import java.util.Scanner;

public class FiboSer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (N): ");
        int n = scan.nextInt();
        
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");
            
            
            int first = 0, second = 1;
            
            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                
               
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println(); 
        }
        
        scan.close();
    }
}
