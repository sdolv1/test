package org.apache.commons.math3.primes;

import java.util.List;

public class PrimeTest {
    public static void main(String []args){
        int test1 = 13;
        boolean result1 = Primes.isPrime(test1);
        System.out.println(result1);
       int result2=Primes.nextPrime(test1);
        List<Integer> test3=Primes.primeFactors(test1);

        System.out.println(result2);

        for (int i = 0; i < test3.size(); i++)
        {
            System.out.println(test3.get(i));
        }
    }
}
