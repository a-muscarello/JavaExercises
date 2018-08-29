package Database;

public class Shoes {

	String brand;
	double size;
	String color;
	int heelHeight;
	String type;
	
	public Shoes(String brand, double size, String color, int heelHeight, String type) {
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.heelHeight = heelHeight;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeelHeight() {
		return heelHeight;
	}

	public void setHeelHeight(int heelHeight) {
		this.heelHeight = heelHeight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
