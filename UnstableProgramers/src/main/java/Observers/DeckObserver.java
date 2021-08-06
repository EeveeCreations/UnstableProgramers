package Observers;

import Observables.DeckObservable;

public interface DeckObserver {

    void addObserver(DeckObservable deckObservable);

    void deleteObserver(DeckObservable deckObservable);

    void updateObservers();

}
