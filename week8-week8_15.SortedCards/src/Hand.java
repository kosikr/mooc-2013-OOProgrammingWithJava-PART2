
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList<Card>();
        
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int sum() {
        int sum = 0;
        for (Card c : hand) {
            sum += c.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand) {
        if (sum() == hand.sum()) {
            return 0;
        } else if (sum() > hand.sum()) {
            return 1;
            
        } else {
            return -1;
        }
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitSorter);
    }
}
