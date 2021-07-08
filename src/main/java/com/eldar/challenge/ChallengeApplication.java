package com.eldar.challenge;

import com.eldar.challenge.creditCard.CreditCard;
import com.eldar.challenge.creditCard.CreditCardOperationUtils;
import com.eldar.challenge.creditCard.Operation;
import com.eldar.challenge.creditCard.card.AMEX;
import com.eldar.challenge.creditCard.card.VISA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);

		try {
			final CreditCardOperationUtils utils = new CreditCardOperationUtils();

			// Create two cards and operations. (First valid, second invalid)
			final CreditCard visaCard = new CreditCard(VISA.getInstance(), 1234567890L, "Juan Perez", Date.valueOf(LocalDate.now().plusYears(3)));
			visaCard.getBrand().setName("Visa");
			final CreditCard amexCard = new CreditCard(AMEX.getInstance(), 2228884440L, "María Gonzales", Date.valueOf(LocalDate.now().minusMonths(10)));
			amexCard.getBrand().setName("Amex");

			final Operation visaOperation = new Operation(500d, visaCard);
			final Operation amexOperation = new Operation(3000d, amexCard);

			// Print out challenge answers
			System.out.println('\n');
			System.out.println("First Card");
			System.out.println("Card Information: " + utils.getCardInfo(visaCard));
			System.out.println("Is Operation valid? " + utils.isOperationValid(visaOperation));
			System.out.println("Is Card valid? " + utils.isCreditCardValid(visaCard));
			System.out.println("Are they the same Card? " + utils.isSameCreditCard(visaCard, amexCard));
			System.out.println("Operation rate, brand, and amount: " + utils.getOperationRate(visaOperation));
			System.out.println('\n');

			System.out.println("Second Card");
			System.out.println("Card Information: " + utils.getCardInfo(amexCard));
			System.out.println("Is Operation valid? " + utils.isOperationValid(amexOperation));
			System.out.println("Is Card valid? " + utils.isCreditCardValid(amexCard));
			System.out.println("Are they the same Card? " + utils.isSameCreditCard(visaCard, amexCard));
			System.out.println("Operation rate, brand, and amount: " + utils.getOperationRate(amexOperation));
			System.out.println('\n');

		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
