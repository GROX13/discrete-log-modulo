package me.giorgirokhadze.cryptography;

import java.math.BigInteger;
import java.util.Hashtable;

abstract class DiscreteLogModuloBase implements DiscreteLogModulo {

    private static final DiscreteLogModulo instance = new DiscreteLogModuloBaseImplementation();

    static DiscreteLogModulo getInstance() {
        return instance;
    }

    private static final class DiscreteLogModuloBaseImplementation extends DiscreteLogModuloBase {

        @Override
        public String calculate(String p, String g, String h) {
            BigInteger P = new BigInteger(p),
                    G = new BigInteger(g),
                    H = new BigInteger(h);
            Hashtable leftHandSide = new Hashtable<>();
            Integer twoToTheTwenty = (int) Math.pow(2, 20);

            return null;
        }

    }

}
