package me.giorgirokhadze.cryptography;

abstract class DiscreteLogModuloBase implements DiscreteLogModulo {

	private static final DiscreteLogModulo instance = new DiscreteLogModuloBaseImplementation();

	static DiscreteLogModulo getInstance() {
		return instance;
	}

	private static final class DiscreteLogModuloBaseImplementation extends DiscreteLogModuloBase {

		@Override
		public String calculate(String p, String g, String h) {
			
			return null;
		}

	}

}
