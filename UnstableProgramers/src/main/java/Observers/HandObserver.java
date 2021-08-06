package Observers;

import Observables.HandObservable;

public interface HandObserver {
    void addObserver(HandObservable deckObservable);

    void deleteObserver(HandObservable deckObservable);

    void updateObservers();
}
