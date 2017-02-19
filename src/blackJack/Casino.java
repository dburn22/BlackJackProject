package blackJack;

public class Casino {

	public static void main(String[] args) {
		Game g1 = new Game();
		g1.game();
	}

	public int getTotal(Player p) {
		int total = 0;
		Player p1 = new Player();

		for (Card c : p.getHand().getCards()) {
			total = total + c.getTotal();

		}
		return total;
	}

	public void listHand(Player p) {
		for (Card c : p.getHand().getCards()) {
			System.out.println(p.getName() + " " + c.getValue() + " " + c.getSuit());
		}
	}

}
