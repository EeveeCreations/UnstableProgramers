package Observers;

import Observables.LobbyObservable;

public interface LobbyObserver {

    void addObserver(LobbyObservable Observable);

    void deleteObserver(LobbyObservable Observable);

    void updateObservers();
}
