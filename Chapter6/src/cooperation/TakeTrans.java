package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
	
		Bus bus100 = new Bus(100);
		Subway subway3 = new Subway(3);
		
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		tomas.takeSubway(subway3);
		tomas.showInfo();
		subway3.showInfo();
	}

}
