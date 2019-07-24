package br.com.medeiros.math;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumbers {

	public static boolean isPrime(final int number) {

		if (number == 2) {
			return true;
		} else if (number % 2 == 0 || number < 2) {
			return false;
		} else {
			boolean dvs = false;
			for (int i = number; i > 2; i--) {
				dvs = number % (i - 1) != 0;
				if (!dvs) {
					return false;
				}
			}
			return dvs;
		}
	}

	public static Set<Integer> getPrimeNumbersAsc(final int start, final int end) {
		final LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Integer> getPrimeNumbersDesc(final int end, final int start) {
		final LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		for (int i = end; i >= start; i--) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Integer> getNonPrimeNumbersAsc(final int start, final int end) {
		final LinkedHashSet<Integer> nonPrimeNumbers = new LinkedHashSet<>();
		for (int i = start; i <= end; i++) {
			if (!isPrime(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	public static Set<Integer> getNonPrimeNumbersDesc(final int end, final int start) {
		final LinkedHashSet<Integer> nonPrimeNumbers = new LinkedHashSet<>();
		for (int i = end; i >= start; i--) {
			if (!isPrime(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	public static Set<Integer> getPrimeNumbersAsc(final int end) {
		return getPrimeNumbersAsc(2, end);
	}

	public static Set<Integer> getNonPrimeNumbersAsc(final int end) {
		return getNonPrimeNumbersAsc(0, end);
	}

	public static Set<Integer> getPrimeNumbersDesc(final int end) {
		return getPrimeNumbersDesc(end, 2);
	}

	public static Set<Integer> getNonPrimeNumbersDesc(final int end) {
		return getNonPrimeNumbersDesc(end, 0);
	}

	private PrimeNumbers() {
	}
}
