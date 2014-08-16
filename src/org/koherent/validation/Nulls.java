package org.koherent.validation;

public class Nulls {
	private Nulls() {
	}

	public static <T> T validate(T value) throws IllegalArgumentException {
		return validate(value, null);
	}

	public static <T> T validate(T value, String valueName)
			throws IllegalArgumentException {
		if (value == null) {
			if (valueName == null) {
				throw new IllegalArgumentException("The value is null");
			} else {
				throw new IllegalArgumentException("'" + valueName
						+ "' is null");
			}
		}

		return value;
	}

	public static <T> T complement(T value, T complement) {
		return value == null ? complement : value;
	}

	public static <T> boolean equals(T a, T b) {
		return a == null ? b == null : a.equals(b);
	}
}
