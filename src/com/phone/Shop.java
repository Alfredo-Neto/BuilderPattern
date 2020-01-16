package com.phone;

public class Shop {

	public static void main(String[] args) {
		
		Phone p = new Phone.PhoneBuilder("Android")
				.display()
				.setBattery(3000)
				.setProcessor("Snapdragon")
				.setRam(2)
				.setScreensize(25)
				.build();

		System.out.println(p);
	}

}
