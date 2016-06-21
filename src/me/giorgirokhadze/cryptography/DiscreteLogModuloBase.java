package me.giorgirokhadze.cryptography;

import java.math.BigInteger;
import java.util.Hashtable;

import static java.lang.Math.*;

abstract class DiscreteLogModuloBase implements DiscreteLogModulo {

	private static final DiscreteLogModulo instance = new DiscreteLogModuloBaseImplementation();

	static DiscreteLogModulo getInstance() {
		return instance;
	}

	private static final class DiscreteLogModuloBaseImplementation extends DiscreteLogModuloBase {

		private static final Integer B = (int) pow(2, 20);

		@Override
		public String calculate(String p, String g, String h) {
			BigInteger
					P = new BigInteger(p),
					G = new BigInteger(g),
					H = new BigInteger(h);
			Hashtable<BigInteger, Integer> leftHandSide = new Hashtable<>();

			for (Integer i = 0; i < B; i++) {
				// BigInteger localResult = H.divide(G.modPow(BigInteger.valueOf(i), P)).mod(P);
				BigInteger localResult = H.multiply(G.modPow(BigInteger.valueOf(i), P).modInverse(P)).mod(P);
				
				leftHandSide.put(localResult, i);				
			}
			
			BigInteger GB = G.modPow(BigInteger.valueOf(B), P);
			
			for (Integer i = 0; i < B; i++) {
				BigInteger localResult = GB.modPow(BigInteger.valueOf(i), P);
				if (leftHandSide.containsKey(localResult)) {
					Integer x1 = leftHandSide.get(localResult);
					return String.valueOf(i * B + x1);
				}
			}
			
			return null;
		}

	}

}
