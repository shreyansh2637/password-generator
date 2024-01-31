import java.util.*;

public class countChar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int q = input.nextInt();
        
        int[] errors = new int[n];
        for (int i = 0; i < n; i++) {
            errors[i] = input.nextInt();
        }
        
        int projects = 0;
        while (true) {
            int maxError = 0;
            for (int i = 0; i < n; i++) {
                if (errors[i] > maxError) {
                    maxError = errors[i];
                }
            }
            if (maxError == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                if (errors[i] > 0) {
                    errors[i] -= q;
                    if (errors[i] < 0) {
                        errors[i] = 0;
                    }
                }
            }
            projects++;
        }
        
        System.out.println(projects);
    }
}