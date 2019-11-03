package dcc603_tdd_practice;

public class Franc extends Money {
	Franc(int amount) {
		this.amount = amount;
	}
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
}
