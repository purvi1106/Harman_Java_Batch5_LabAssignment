package Assignment4;
import java.io.*;
import java.util.*;

public class Product implements Comparable<Product> {
	//Queue<String> product = new PriorityQueue<>();
	private int Id;
	private String name;
	private int price;
	
	public Product(int Id,String name,int price) {
		this.Id=Id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		if(this.getPrice()>product.getPrice()) {
			return 1;
		}else if(this.getPrice()<product.getPrice()) {
			return -1;
		}else {
		return 0;
	}
} 
}
