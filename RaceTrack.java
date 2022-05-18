class RaceTrack{
	public static void main(String[] args){
		Car c = new Car(2010,"Porche",25.00);
		System.out.println("Year of manufacture = "+c.getYear());
		System.out.println("Nmae of the car = "+c.getMake());
		System.out.println("Speed of the car = "+c.getSpeed());
		
		c.accelerate();
		System.out.println("Speed of the car after acceleration = "+c.getSpeed());
	}
}