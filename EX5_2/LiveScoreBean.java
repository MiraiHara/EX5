package EX5_2;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreData;
    
    public static final String PROP_SOMEDATA = "Data";
    
    public String getSomeline() {
        return scoreData;
    }
    
    
    public void setSomeline(String scoreData) {
        String oldSomeData = this.scoreData;
        this.scoreData = scoreData;
        propertyChangeSupport.firePropertyChange(PROP_SOMEDATA, oldSomeData, scoreData);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
