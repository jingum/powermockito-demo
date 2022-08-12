package de.cellent.bt.test_demo.impl;

public class PowerWithDelegationStruct {

	private ExponentDelegate delegate;

	// public void setExponentDelegate(ExponentDelegateImpl delegate) {
	// 	this.delegate = delegate;
	// }

    private PowerWithDelegationStruct() {
        this.delegate = new ExponentDelegateImpl();
    }

	public long power(long base) {
		int exponent = delegate.getExponent();
		long power = 1;
		for (int i = 0; i < exponent; i++) {
			power *= base;
		}
		return power;
	}
}
