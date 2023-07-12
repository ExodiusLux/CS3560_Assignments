package Assignment2;

public class Worker {
	private String name;
	private double hourlyRate;
	
	public Worker(String name, double hourlyRate) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
	}

	public String getName() {//get worker name
		return name;
	}

	public void setName(String name) {//set worker name
		this.name = name;
	}

	public double getHourlyRate() {//get worker hourly rate
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {//set worker hourly rate
		this.hourlyRate = hourlyRate;
	}
	
	
}
