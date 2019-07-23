package br.com.medeiros.math;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumbers {

	public static boolean isPrime(final int number) {

		if (number % 2 == 0 || number <= 1) {
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

	public static Set<Integer> getPrimeNumbers(final int maxNumber) {
		final LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		for (int i = 3; i <= maxNumber; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static Set<Integer> getNonPrimeNumbers(final int maxNumber) {
		final LinkedHashSet<Integer> nonPrimeNumbers = new LinkedHashSet<>();
		for (int i = 0; i <= maxNumber; i++) {
			if (!isPrime(i)) {
				nonPrimeNumbers.add(i);
			}
		}
		return nonPrimeNumbers;
	}

	private PrimeNumbers() {
	}
}
