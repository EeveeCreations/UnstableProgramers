package Observers;

import Observables.StableObservable;

public interface StableObserver {

    void addObserver(StableObservable Observable);

    void deleteObserver(StableObservable Observable);

    void updateObservers();
}
