package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5]; 
		
		
		
		library[0] = new Book("����1", "�۰�1");
		library[1] = new Book("����2", "�۰�2");
		library[2] = new Book("����3", "�۰�3");
		library[3] = new Book("����4", "�۰�4");
		library[4] = new Book("����5", "�۰�5");
		for(int i =0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
