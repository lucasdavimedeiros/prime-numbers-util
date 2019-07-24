package br.com.medeiros.math;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumbers {

	public static boolean isPrime(final long number) {

		if (number == 2) {
			return true;
		} else if (number % 2 == 0 || number < 2) {
			return false;
		} else {
			boolean dvs = false;
			for (long i = number; i > 2; i--) {
				dvs = number % (i - 1) != 0;
				if (!dvs) {
					return false;
				}
			}
			return dvs;
		}
	}

	public static Set<Long> getPrimeNumbersAsc(final long start, final long end) {
		final LinkedHashSet<Long> primeNumbers = new LinkedHashSet<>();
		for (long i = start; i <= end; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Long> getPrimeNumbersDesc(final long end, final long start) {
		final LinkedHashSet<Long> primeNumbers = new LinkedHashSet<>();
		for (long i = end; i >= start; i--) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Long> getNonPrimeNumbersAsc(final long start, final long end) {
		final LinkedHashSet<Long> nonPrimeNumbers = new LinkedHashSet<>();
		for (long i = start; i <= end; i++) {
			if (!isPrime(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	public static Set<Long> getNonPrimeNumbersDesc(final long end, final long start) {
		final LinkedHashSet<Long> nonPrimeNumbers = new LinkedHashSet<>();
		for (long i = end; i >= start; i--) {
			if (!isPrime(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	public static long getNextPrime(final long number) {
		boolean got = false;
		long n = number + 1;
		while (!got) {
			got = isPrime(n);
			if (!got) {
				n++;
			}
		}
		return n;
	}

	public static long getPreviousPrime(final long number) {
		boolean got = false;
		long n = number - 1;
		while (!got) {
			got = isPrime(n);
			if (!got) {
				n--;
			}
		}
		return n;
	}

	public static Set<Long> getPrimeNumbersAsc(final long end) {
		return getPrimeNumbersAsc(2, end);
	}

	public static Set<Long> getNonPrimeNumbersAsc(final long end) {
		return getNonPrimeNumbersAsc(0, end);
	}

	public static Set<Long> getPrimeNumbersDesc(final long end) {
		return getPrimeNumbersDesc(end, 2);
	}

	public static Set<Long> getNonPrimeNumbersDesc(final long end) {
		return getNonPrimeNumbersDesc(end, 0);
	}

	private PrimeNumbers() {
	}
}
