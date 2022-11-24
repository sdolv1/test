package org.apache.commons.math3.primes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimesTest_withJunit {

    @Test
    public void isPrime() {
        int test1 = 13;
        boolean result1 = Primes.isPrime(test1);
        System.out.println(result1);
    }

    @Test
    public void nextPrime() {
        int test1 = 17;
        int result2=Primes.nextPrime(test1);
        System.out.println(result2);
    }

    @Test
    public void primeFactors() {
        int test1 = 7;
        List<Integer> test3=Primes.primeFactors(test1);
        for (int i = 0; i < test3.size(); i++)
        {
            System.out.println(test3.get(i));
        }
    }
}