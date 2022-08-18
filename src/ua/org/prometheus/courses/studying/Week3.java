package ua.org.prometheus.courses.studying;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week3 {

    // Task 1

    class Node {
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }
    }

    public class LinkedList<C> {
        private int listCount;
        private Node headNode;

        public LinkedList() {
            headNode = new Node();
            headNode.setData(null);
            listCount = 0;
        }

        public void add(Integer data) {
            Node newNode = new Node();
            Node currentNode = headNode;
            newNode.setData(data);
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            listCount++;
        }

        public Integer get(int index) {
            if (index < 0 || index >= size()) {
                return null;
            }
            Node current = headNode;
            for (int i = 0; i <= index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }

        public boolean delete(int index) {
            if (index < 0 || index > size()) {
                return false;
            }
            Node current = headNode;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            listCount--;
            return true;
        }

        public int size() {
            return listCount;
        }
    }

    // Task 2

    public class Card {
        private Rank rank;
        private Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }
    }

    public static class Rank {
        public static final Rank ACE = new Rank("Ace");
        public static final Rank KING = new Rank("King");
        public static final Rank QUEEN = new Rank("Queen");
        public static final Rank JACK = new Rank("Jack");
        public static final Rank TEN = new Rank("10");
        public static final Rank NINE = new Rank("9");
        public static final Rank EIGHT = new Rank("8");
        public static final Rank SEVEN = new Rank("7");
        public static final Rank SIX = new Rank("6");

        public static Rank[] values = {ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX};

        private String name;

        Rank(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Suit {
        public static final Suit HEARTS = new Suit("HEARTS");
        public static final Suit DIAMONDS = new Suit("DIAMONDS");
        public static final Suit CLUBS = new Suit("CLUBS");
        public static final Suit SPADES = new Suit("SPADES");

        public static Suit[] values = {HEARTS, DIAMONDS, CLUBS, SPADES};

        private String name;

        Suit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Deck {

        private List<Card> cards = (List<Card>) new LinkedList<Card>();

        // creates a card deck of 36 cards
        public Deck() {
            cards.clear();

            for (Suit suit : Suit.values) {
                for (Rank rank : Rank.values) {
                    cards.add(new Card(rank, suit));
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }

        public void order() {
            cards.sort(new Comparator<Card>() {
                @Override
                public int compare(Card c1, Card c2) {
                    return 100 * java.util.Arrays.asList(Suit.values).indexOf(c1.getSuit()) -
                            100 * java.util.Arrays.asList(Suit.values).indexOf(c2.getSuit())
                            + java.util.Arrays.asList(Rank.values).indexOf(c1.getRank())
                            - java.util.Arrays.asList(Rank.values).indexOf(c2.getRank());

                }
            });
        }

        public boolean hasNext() {
            return cards.size() > 0;
        }

        public Card drawOne() {
            if (hasNext()) {
                Card card = cards.get(cards.size() - 1);
                cards.remove(cards.size() - 1);
                return card;
            } else
                return null;
        }
    }

    // Task 3

    public class Fibonacci {

        public long getNumber(int position) {
            if (position <= 0) {
                return -1;
            }

            if (position == 1 || position == 2) {
                return 1;
            } else {
                long n1 = getNumber(position - 1);
                long n2 = getNumber(position - 2);
                return n1 + n2;
            }
        }
    }


}
