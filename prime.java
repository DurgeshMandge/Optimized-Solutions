import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        System.out.println("Most optimized solution of prime numbers between 1 to <lastNumber>:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last number:");
        int lastNumber=sc.nextInt();
        boolean[] arr=new boolean[lastNumber+1];
        sieve(lastNumber, arr);
    }

    static void sieve(int n,boolean[] primes){ 
        // false means prime
        for (int i = 2; i*i<=n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
            }
        }
        System.out.print("Prime numbers between 1 to "+ n+ " are: ");
        for (int i = 2; i < primes.length; i++) {
            if(!primes[i]){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Time Complexity = O("+n+"*log(log "+n+"))");
        System.out.println("Auxilary Space = O("+n+") ");
    }

}