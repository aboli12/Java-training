package polymorphism;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {					// inherits 
	void colour() {
		System.out.println("Red Colour");
	}
}
class Pulsar extends Bike {
	void colour() {
		System.out.println("Black Colour");
	}
	@Override
	void speed() {					// override it 
		System.out.println("90km/hr");
	}
}
class Tvs extends Bike {
	void colour() {
		System.out.println("White Colour");
	}
	@Override
	void speed() {
		super.speed();						// calling super class speed() method. 		merge both class code 
		System.out.println("10km/hr");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
	Honda hh = new Honda();		hh.speed(); hh.colour();
	Pulsar pu = new Pulsar();	pu.speed(); pu.colour();
	Tvs tv = new Tvs();			tv.speed(); tv.colour();
	}
	
}