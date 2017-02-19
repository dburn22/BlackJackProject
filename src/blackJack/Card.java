package blackJack;

public class Card {
	private Value value;
	private Suit suit;
	protected  int total;

	public Card(Value v, Suit s, int t){
		this.suit = s;
		this.value = v;
		this.total = t;




	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [value=");
		builder.append(value);
		builder.append(", suit=");
		builder.append(suit);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getTotal() {
		return total;
	}
}
