import java.util.*; 
public class GenerateRandomCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
            int n = scan.nextInt();
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                System.out.print(rand.nextInt() + " ");
            }
        }
    }