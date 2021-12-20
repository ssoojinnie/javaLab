package singleton;
import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1 = Company.getinstance();
		Company c2 = Company.getinstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar cal = Calendar.getInstance();
	}

}
