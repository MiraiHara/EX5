package EX5_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent event) {
         System.out.println("live result: " + event.getNewValue());
    }
    
}
