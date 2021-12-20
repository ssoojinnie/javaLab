package singleton;

public class Company {

	private static Company company = new Company();
	private Company(){}
	
	public static Company getinstance() {
		if(company==null)
			company = new Company();
		return company;
	}
}
