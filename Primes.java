public class Primes {
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        int i = 2;
        int p = 2;
        int count = 0;

        while (i <= N){
            isPrime[i] = true;
            i++;
        }

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
        System.out.println("prime numbers up to " + N + ":");
        for (int k = 2; k < isPrime.length; k++){
            if (isPrime[k]){
                System.out.println(k);
                count++;
            }
            
        }

        
        double precent = ((double)count / N) * 100;

        System.out.println("There are " + count + " primes between 2 and " + N + " (" + (int)(precent) + "% are primes)" );

    }

}
