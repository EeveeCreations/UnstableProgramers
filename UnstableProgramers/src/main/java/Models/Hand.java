package Models;

import java.util.ArrayList;

public class Hand {
        //    Attributes
        private Player holder;
        private ArrayList<Card> cards;
        //    Constructor


        //    Setters

        public void setHolder(Player holder) {
                this.holder = holder;
        }

        public void setCards(ArrayList<Card> cards) {
                this.cards = cards;
        }



        //    Getters

        public Player getHolder() {
                return holder;
        }

        public ArrayList<Card> getCards() {
                return cards;
        }
}
