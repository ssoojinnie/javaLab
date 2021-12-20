package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3]; 
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백", "조정래1");
		bookArray1[1] = new Book("태백2", "조정래2");
		bookArray1[2] = new Book("태백3", "조정래3");
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i =0; i<bookArray1.length; i++) {
			bookArray2[i] = new Book();
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		for(int i =0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		//Enhanced for
		String[] strArr = {"Java", "Android", "C"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
	}
}
