public class Primes {
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        int i = 2;
        int p = 2;
        int count = 0;
        // Assume all numbers from 2 to N are prime (set all to true)   
        while (i <= N){
            isPrime[i] = true;
            i++;
        }
        // Use the Sieve of Eratosthenes to find all primes up to N
        while (p <= Math.sqrt(N)){
            int j = 2;
            if (isPrime[p]) {
                while (j < isPrime.length){
                    if (j % p == 0 && j != p){
                        isPrime[j] = false;
                    }
                    
                    j++;

                }

            }
            p++;
        }
        System.out.println("Prime numbers up to " + N + ":");
        for (int k = 2; k < isPrime.length; k++){
            if (isPrime[k]){
                System.out.println(k);
                count++;
            }
            
        }

        // Calculate and print the percentage of primes in the range
        double precent = ((double)count / N) * 100;

        System.out.println("There are " + count + " primes between 2 and " + N + " (" + (int)(precent) + "% are primes)" );

    }

}
