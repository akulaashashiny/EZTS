package com.Product.jdbc;

public class SettersGetters {
	private int Product_id;
	private String Product_name;
	private String Brand;
	private String Category;
	private int Price;
	public SettersGetters(int product_id, String product_name, String brand, String category, int price) {
		super();
		Product_id = product_id;
		Product_name = product_name;
		Brand = brand;
		Category = category;
		Price = price;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "SettersGetters [Product_id=" + Product_id + ", Product_name=" + Product_name + ", Brand=" + Brand
				+ ", Category=" + Category + ", Price=" + Price + "]";
	}
	

}
