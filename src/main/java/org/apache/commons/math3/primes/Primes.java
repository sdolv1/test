//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package org.apache.commons.math3.primes;

import java.util.List;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

public class Primes {
    private Primes() {
    }

    public static boolean isPrime(int n) {
        if (n < 2)
        {
            return false;
        }
        else {
            int[] arr$ = SmallPrimes.PRIMES;
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$)
            {
                int p = arr$[i$];
                //修改原为0 == n % p的判断条件为0 ！= n % p
                if (0 == n % p)
                {
                    return n == p;
                }
            }

            return SmallPrimes.millerRabinPrimeTest(n);
        }
    }

    public static int nextPrime(int n) {
        if (n < 0) {
            throw new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL, new Object[]{n, 0});
        }
        else if (n == 2)
        {
            return 2;
        }
        else
        {
            n |= 1;
            if (n == 1)
            {
                return 2;
            }
            /*2修改原else if (isPrime(n))为else if (!isPrime(n))*/
            else if (isPrime(n))
            {
                return n;
            }
            else
            {
                int rem = n % 3;
                if (0 == rem) {
                    n += 2;
                } else if (1 == rem) {
                    n += 4;
                }

                while(!isPrime(n)) {
                    n += 2;
                    if (isPrime(n)) {
                        return n;
                    }

                    n += 4;
                }

                return n;
            }
        }
    }

    public static List<Integer> primeFactors(int n) {
        //修改判断条件if (n < 2)为if (n > 1)
        if (n < 2)
        {
            throw new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL, new Object[]{n, 2});
        } else
        {
            return SmallPrimes.trialDivision(n);
        }
    }
}
