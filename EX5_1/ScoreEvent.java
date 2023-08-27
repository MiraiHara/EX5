package EX5_1;
import java.util.EventObject;

public class ScoreEvent extends EventObject{

    private String score;
    public String getScore(){
        return score;
    } 
    
    public ScoreEvent(Object gg, String value){
        super(gg);
        score = value;
    }
}