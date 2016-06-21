package me.giorgirokhadze.cryptography;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello...");

		String p = "13407807929942597099574024998205846127479365820592393377723561443721764030073546976801874298166903427690031858186486050853753882811946569946433649006084171";
		String g = "11717829880366207009516117596335367088558084999998952205599979459063929499736583746670572176471460312928594829675428279466566527115212748467589894601965568";
		String h = "3239475104050450443565264378728065788649097520952449527834792452971981976143292558073856937958553180532878928001494706097394108577585732452307673444020333";

		String result = DiscreteLogModuloBase.getInstance().calculate(p, g, h);
		result = new BigInteger(g).pow(Integer.valueOf(result)).toString();
		System.out.println("X: ".concat(result));
		System.out.println("H: ".concat(h));
		System.out.println("R: ".concat(result));

		System.out.println("Passed: ".concat(String.valueOf(h.equals(result))));
	}

}
