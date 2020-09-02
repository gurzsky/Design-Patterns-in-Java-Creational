package com.course.abstractoryfactory;

public class VisaFactory extends CreditCardFactory {
	
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaBlackCreditCard();
		default:
			break;
		}
		return null;
	}

}
