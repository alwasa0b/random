package mvcPattern;

public class Driver {


	public static void main(String[] args) {
		CarModel model  = retriveStudentFromDatabase();
		CarView view = new CarView();
		CarController controller = new CarController(model, view);

		
		controller.updateView();
		controller.setModel("Raptor");
		controller.setEngine("V8");
		controller.updateView();
	}

	private static CarModel retriveStudentFromDatabase(){
		CarModel car = new CarModel("Ford","Mustang","V6");
		return car;
	}


}
