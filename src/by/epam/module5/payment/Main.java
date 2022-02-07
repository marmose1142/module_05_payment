package by.epam.module5.payment;

import by.epam.module5.payment.Payment.Product;

/*Создать класc Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.addProduct(new Payment.Product("rise", 12.50));
		payment.addProduct(new Payment.Product("meat", 34.00));
		payment.addProduct(new Payment.Product("milk", 1.50));
		payment.addProduct(new Payment.Product("aplle", 2.35));
		PaymentLogic paymentLogic = new PaymentLogic();
		View view = new View();
		view.printTotalSum(paymentLogic.totalSum(payment.getProducts()));

	}

}
