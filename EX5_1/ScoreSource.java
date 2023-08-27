package EX5_1;
import java.util.ArrayList;

public class ScoreSource {
    private ArrayList<ScoreListener> observer;

    ScoreSource(){
        observer = new ArrayList<>();
    }

     void addObserver(ScoreListener obj){
        observer.add(obj);
    }

     void setScoreLine(String value){
        fireHeadQuater(new ScoreEvent(this , value));
    }

    void fireHeadQuater(ScoreEvent evt){
        for(ScoreListener observer: observer){
            observer.scoreChange(evt);
        }
    }
}
