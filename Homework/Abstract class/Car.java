
abstract class Car {

	private String _Driver;

    public Car(String Driver) {
        _Driver = Driver;
    }

    public String getDriver(){
        return _Driver;
    }

    public abstract void CarMaxSpeed();

    public abstract void CarModel();

}

