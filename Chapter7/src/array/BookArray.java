package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5]; 
		
		
		
		library[0] = new Book("力格1", "累啊1");
		library[1] = new Book("力格2", "累啊2");
		library[2] = new Book("力格3", "累啊3");
		library[3] = new Book("力格4", "累啊4");
		library[4] = new Book("力格5", "累啊5");
		for(int i =0; i<library.length; i++) {
			library[i].showBookInfo();
		}
	}

}
