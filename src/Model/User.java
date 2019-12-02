package Model;

import java.util.HashMap;
import java.util.*;

public class User {
    String name;
    List<Watchable> saved;
    List<Watchable>  watched;

    public User (String name){
        this.name = name;
        saved = new HashMap<Watchable>(); //vi skal bruge en key dunno
        watched = new HashMap<Watchable>();
    }
    public void addSaved(Watchable watchable){
        saved.put("",watchable);
    }
    public void addWatched(Watchable watchable){
        watched.put("",watchable);
    }

    //TODO: Add to ”Saved”
    //TODO: Add film and series to a list of “watched”
    //TODO: Change Account
}
