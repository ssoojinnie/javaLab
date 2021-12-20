package exception;

public class IDFormatExceptionTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("ID �� null �� �� ����");
		}else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("ID �� 8�̸�, 20�ʰ� �Ұ�");
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
