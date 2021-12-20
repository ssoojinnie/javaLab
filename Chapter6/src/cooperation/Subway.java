package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ "+lineNumber+"È£¼±ÀÇ ½Â°´Àº"+passengerCount+
				" ¼öÀÔÀº "+money);
	}
}
