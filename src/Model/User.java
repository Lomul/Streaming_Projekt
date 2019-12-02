package Model;

import java.util.HashMap;
import java.util.*;

public class User {
    String name;
    HashMap<Watchable, String> saved;
    HashMap<Watchable, String> watched;

    public User (String name){
        this.name = name;
        saved = new HashMap<>();
        watched = new HashMap<>();
    }
    public void addSaved(Watchable watchable){
        saved.put(watchable, "");
    }
    public void addWatched(Watchable watchable){
        watched.put(watchable, "");
    }

    //Add to ”Saved”
    //Add film and series to a list of “watched”
    //Change Account
}
