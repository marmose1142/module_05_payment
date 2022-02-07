package by.epam.module5.payment;

import java.util.List;

import by.epam.module5.payment.Payment.Product;

public class PaymentLogic {
	public double totalSum(List<Product> products) {
		double sum = 0;

		for (int i = 0; i < products.size(); i++) {
			sum = sum + products.get(i).getPrice();
		}

		return sum;
	}

}
