main() {
  var deck = Deck();
  print(deck);
}

class Card {
  String suit;
  String rank;
  Card(this.rank, this.suit);

  @override
  String toString() {
    return '$rank of $suit';
  }
}

class Deck {
  List<Card> cards = [];

  Deck() {
    var ranks = ['Ace', 'Two', 'Three', 'Four', 'Five'];
    var suits = ['Diamonds', 'Hearts', 'Clubs', 'Spades'];

    for (var suit in suits) {
      for (var rank in ranks) {
        var card = Card(rank, suit);
        cards.add(card);
      }
    }
  }

  shuffle() {
    cards.shuffle();
  }

  cardsWithSuit(String suit) {
    return cards.where((card) {
      card.suit == suit;
    });
  }

  deal(int handSize) {
    var hand = cards.sublist(0, handSize);
    cards = cards.sublist(handSize);
    return hand;
  }

  removeCard(String suit, String rank) {
    cards.removeWhere((card) {
      return ((card.suit == suit) && (card.rank == rank));
    });
  }

  toString() {
    return cards.toString();
  }
}
