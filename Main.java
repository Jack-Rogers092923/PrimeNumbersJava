import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ask for the first n number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // ask for the prime number
        System.out.println("Enter a prime number:");
        int p = sc.nextInt();

        // read what n and p are and find the next prime number after n
        int nextPrime = findNextNumberAfterP(n, p);
        {System.out.println(nextPrime);}

    }

    static boolean isPrime(int num) {
        // if n is less than or equal to one then don't read it because one is not a prime number
        if (num <=  1) {
            return false;
        }
        // check if the number is divisible by any number but itself if it is then it's not prime
        for (int i =  2; i * i <= num; i++) {
            if (num % i ==  0) {
                return false;
            }
        }
        // anything else then it is prime
        return true;
    }

  static int findNextNumberAfterP(int n, int p) {
        // make a var for when the number reaches the next prime number
        int c =  0;
        int number = p +  1;
        while (c < n) {
            if (isPrime(number)) {
                c++;
            }
            number++;
        }
        return number -  1;
    }
}

