package com.phone;

public class Phone {
	private String os = "";
	private int ram;
	private String processor;
	private double screensize;
	private int battery;

	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
		
	}
	
	public static class PhoneBuilder {
		private final String os;
		private int ram;
		private String processor;
		private double screensize;
		private int battery;
		
		public PhoneBuilder display() {
			System.out.println("Test1!");
			return this;
		}
		
		public PhoneBuilder(String os) {
			this.os = os;
		}
		public PhoneBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public PhoneBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		public PhoneBuilder setScreensize(double screensize) {
			this.screensize = screensize;
			return this;
		}
		public PhoneBuilder setBattery(int battery) {
			this.battery = battery;
			return this;
		}
		
		public Phone build(){
			return new Phone(this);
		}
		
		
	}
	
		public Phone(PhoneBuilder builder) {
			os = builder.os;
			ram = builder.ram;
			processor = builder.processor;
			screensize = builder.screensize;
			battery = builder.battery;
		}

}
