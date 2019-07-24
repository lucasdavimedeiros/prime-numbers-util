package br.com.medeiros.math;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumbersUtil {

	public static boolean isPrimeNumber(final long number) {

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

	public static Set<Long> getPrimeNumbers(final long end) {
		final LinkedHashSet<Long> primeNumbers = new LinkedHashSet<>();
		for (long i = 2; i <= end; i++) {
			if (isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Long> getNonPrimeNumbers(final long end) {
		final LinkedHashSet<Long> nonPrimeNumbers = new LinkedHashSet<>();
		for (long i = 0; i <= end; i++) {
			if (!isPrimeNumber(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	public static long getNextPrimeNumber(final long number) {
		boolean got = false;
		long n = number + 1;
		while (!got) {
			got = isPrimeNumber(n);
			if (!got) {
				n++;
			}
		}
		return n;
	}

	public static long getPreviousPrimeNumber(final long number) {
		boolean got = false;
		long n = number - 1;
		while (!got) {
			got = isPrimeNumber(n);
			if (!got) {
				n--;
			}
		}
		return n;
	}

	public static Set<Long> getFirstXPrimeNumbers(final long x) {
		final LinkedHashSet<Long> primeNumbers = new LinkedHashSet<>();
		for (long i = 2; primeNumbers.size() < x; i++) {
			if (isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	private PrimeNumbersUtil() {
	}
}
