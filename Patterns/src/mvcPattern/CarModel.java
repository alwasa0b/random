package mvcPattern;

public class CarModel {
	private String maker;
	private String model;
	private String engine;
	
	public CarModel( String maker,String model,String engine) {
		// TODO Auto-generated constructor stub
		this.maker=maker;
		this.model=model;
		this.engine=engine;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
