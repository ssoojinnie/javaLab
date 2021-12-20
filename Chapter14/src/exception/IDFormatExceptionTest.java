package exception;

public class IDFormatExceptionTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("ID 는 null 일 수 없음");
		}else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("ID 는 8미만, 20초과 불가");
		}
	}
	
	public static void main(String[] args) {
		IDFormatExceptionTest idTest = new IDFormatExceptionTest();
		
		String userID = null;
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e){
			System.out.println(e);
		}
		
		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
