package BuilderDesignPattern;

import BuilderDesignPattern.Computer.ComputerBuilder;

public class Test {
	public static void main(String[] args) {
		Computer computer1 = new Computer.ComputerBuilder("150 GB", "4 GB").build();
		System.out.println(computer1);
		Computer computer2 = new Computer.ComputerBuilder("200 GB", "3 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(computer2);
	}

}
