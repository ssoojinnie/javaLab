package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("¹ö½º"+busNumber+"¹øÀÇ ½Â°´Àº"+passengerCount+
				" ¼öÀÔÀº "+money);
	}
}
