class Audi extends Car {
	
	public Audi(String Driver) {
		super(Driver);
	}
@Override
    public void CarMaxSpeed() {
        System.out.println("340 km/h");
    }
@Override
    public void CarModel(){
        System.out.println("Audi RS6");
    }
}