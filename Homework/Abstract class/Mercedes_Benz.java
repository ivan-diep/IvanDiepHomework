class Mercedes_Benz extends Car {
	
	public Mercedes_Benz(String Driver) {
		super(Driver);
	}
@Override
    public void CarMaxSpeed() {
        System.out.println("340 km/h");
    }
@Override
    public void CarModel(){
        System.out.println("Mercedes C63 AMG");
    }
}