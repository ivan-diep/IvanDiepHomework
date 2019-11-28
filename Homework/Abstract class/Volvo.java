class Volvo extends Car {
	
	public Volvo(String Driver) {
		super(Driver);
	}
@Override
    public void CarMaxSpeed() {
        System.out.println("250 km/h");
    }
@Override
    public void CarModel(){
        System.out.println("Volvo S60");
    }
}
