package Assignment2;

public class Worker {
	private String name;
	private double hourlyRate;
	
	public Worker(String name, double hourlyRate) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}
