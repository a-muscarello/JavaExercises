package Car;

public class Car {

	String model;
	int horsePower;
	String color;
	int manufactureYear;
	
	public Car (String model, int horsePower, String color, int manufactureYear) {
		this.model = model;
		this.horsePower = horsePower;
		this.color = color;
		this.manufactureYear = manufactureYear;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	} 
}
