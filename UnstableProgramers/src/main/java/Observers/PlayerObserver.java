package Observers;

import Observables.PlayerObservable;

public interface PlayerObserver {
    void addObserver(PlayerObservable Observable);

    void deleteObserver(PlayerObservable Observable);

    void updateObservers();
}
