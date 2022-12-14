import java.util.*;

public class BasicCodingTest15 {
	static void swap(int [] a , int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    static boolean nextPermutation(int [] a) {
        int i = a.length-1;
        
        while(i > 0 && a[i] <= a[i-1]) {
            i--;
        }
        
        if(i <= 0) {
            return false;
        }
        
        int j = a.length-1;
        while(a[i-1] >= a[j]) {
            j--;
        }
        
        swap(a, i-1, j);
        
        j = a.length-1;
        while(i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
        
        return true;
    }
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        
        for(int i=1; i<=n; i++) {
            a[i-1] = i;
        }
        
        do {
            for(int i=0; i<n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        } while(nextPermutation(a));
        sc.close();
    }
}
