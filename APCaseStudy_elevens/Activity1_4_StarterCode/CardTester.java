/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card QofSpades = new Card("Queen","Spades",10);
		Card QueenOfSpades =  new Card("Queen","Spades",10);
		Card AceOfClubs = new Card("Ace","Clubs",1);
		
		System.out.println(QofSpades.toString());
		System.out.println(QueenOfSpades.toString());
		System.out.println(AceOfClubs.toString());
		
		System.out.println(QofSpades.matches(QueenOfSpades));
	}
}
