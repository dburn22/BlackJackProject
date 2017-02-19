package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> cards;

	public Hand(){
		cards = new ArrayList<>();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card c){
		cards.add(c);
	}

}
