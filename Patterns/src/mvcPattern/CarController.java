package mvcPattern;

public class CarController {
	CarModel model;
	CarView view;
	public CarController(CarModel model, CarView view){
		this.model = model;
		this.view = view;
	}
	public String getMaker() {
		return model.getMaker();
	}
	public void setMaker(String maker) {
		this.setMaker(maker);
	}
	public String getModel() {
		return this.model.getModel();
	}
	public void setModel(String model) {
		this.model.setModel(model);
	}
	public String getEngine() {
		return this.model.getEngine();
	}
	public void setEngine(String engine) {
		this.model.setEngine(engine);
	}
	public CarController() {
		// TODO Auto-generated constructor stub
	}

	public void updateView(){				
		view.carDetails(model.getMaker(), model.getModel(),model.getEngine());
	}	

}
