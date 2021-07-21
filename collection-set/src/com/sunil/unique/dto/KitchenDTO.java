package com.sunil.unique.dto;

import java.io.Serializable;
import java.util.Comparator;

public class KitchenDTO implements Serializable,Comparable<KitchenDTO> {

	private String name;
	private double price;
	private String usedFor;
	private String madeof;

	public KitchenDTO() {
		System.out.println("Created kitchenDTO ");
	}

	public KitchenDTO(String name, double price, String usedFor, String madeof) {
		super();
		this.name = name;
		this.price = price;
		this.usedFor = usedFor;
		this.madeof = madeof;
	}

	@Override
	public String toString() {
		return "KitchenDTO [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeof=" + madeof + "]";
	}

	@Override
	public int hashCode() {
		return 66;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof KitchenDTO) {
			KitchenDTO dt = (KitchenDTO) obj;
			if (this.name.equals(dt.name) && this.madeof.equals(dt.madeof)) {
			}
		}

		return true;
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

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getMadeof() {
		return madeof;
	}

	public void setMadeof(String madeof) {
		this.madeof = madeof;
	}

	@Override
	public int compareTo(KitchenDTO o) {
		
		return this.name.compareTo(o.getName());
	}

	}

