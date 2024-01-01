class Library {
	private String [] avaliableBooks;
	private int numberOfBooks;

	public Library() {
		avaliableBooks = new String [100];
		numberOfBooks = 0;
	}

	public void addBook(String book) {
		this.avaliableBooks[numberOfBooks] = book;
		System.out.printf("Book %d Added: %s",(this.numberOfBooks+1), this.avaliableBooks[numberOfBooks]);
		System.out.println();
		numberOfBooks++;		
	}

	public void showAvaliableBooks() {
		if (this.numberOfBooks == 0) {
			System.out.println("There are no books avaliable");
		}
		else {
			int i = 1;
			System.out.println("\nTOTAL BOOKS AVALIABLE: " + this.numberOfBooks);
			for (String element : this.avaliableBooks) {
				if (element == null) {
					break;
				}
				System.out.println("Book " + i + " : " + element);
				i++;
			}
		} // else end
        System.out.println();
	} // method end

	public void removeBook(String book) {
    	System.out.println();
    	for (int i = 0; i < this.avaliableBooks.length; i++) {
        	if (book.equals(this.avaliableBooks[i])) {
            	System.out.println("Book \"" + this.avaliableBooks[i] + "\" removed...");
            	for (int j = i; j < this.numberOfBooks - 1; j++) {
            	    this.avaliableBooks[j] = this.avaliableBooks[j+1];
            	}
            	this.avaliableBooks[this.numberOfBooks-1] = null;
            	numberOfBooks--;
            	break;
        	}
    	}
	}

} // class end

public class Library_Program {
	public static void main(String[] args) {
		System.out.println();
		Library obj = new Library();

		obj.addBook("The Great Gatsby");
		obj.addBook("War and Peace");
		obj.addBook("The Psychology of Money");
		obj.addBook("48 Laws of Power");
		obj.addBook("Ikigai - the way of life");
		obj.addBook("The Subconsious Power of Mind");

		obj.removeBook("War and Peace");

		obj.showAvaliableBooks();
	}
}