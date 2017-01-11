package studentOrientation.simpleFactory;

import studentOrientation.activities.books.BuyBooksA;
import studentOrientation.activities.books.MandoBooks;
import studentOrientation.activities.books.UnivBookStore;
import studentOrientation.enums.BuyBooksChoice;

/**
 * 
 * @author Ankush & Purva
 * Static simple factory to create buyBooksA
 *
 */
public class SimpleBuyBooksFactory {
	
	/**
	 * metod to create buyBooksA object
	 * @param booksChoiceIn
	 * @return BuyBooksA object
	 */
	public static BuyBooksA createBuyBooks(BuyBooksChoice booksChoiceIn){
		BuyBooksA myBooks = null;
		if(booksChoiceIn == BuyBooksChoice.UNIVSTORE){
			myBooks = new UnivBookStore();
		}
		if(booksChoiceIn == BuyBooksChoice.MANDOBOOKS){
			myBooks = new MandoBooks();
		}
		return myBooks;
	}
}
