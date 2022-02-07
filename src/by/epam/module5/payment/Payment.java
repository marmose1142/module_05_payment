package by.epam.module5.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

	private List<Product> products = new ArrayList<>();

	public Payment() {

	}

	public Payment(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		products.add(product);

	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public static class Product {
		private String name;
		private double price;

		public Product() {

		}

		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "Payment [products=" + products + "]";
	}

}
