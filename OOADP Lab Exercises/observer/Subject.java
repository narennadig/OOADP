
import java.util.*;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    public ArrayList<observer>observers= new ArrayList<observer>();
    public int state;


    /**
     * 
     */
    public int getstate() {
        return state;
    }

    /**
     * 
     */
    public void setstate(int state) {
       this.state = state;
      notifyallobservers();
    }

    /**
     * 
     */
    public void attach(observer ob) {
        observers.add(ob);	
    }

    /**
     * 
     */
    public void notifyallobservers() {
        for (observer ob : observers) {
         ob.update();
    }

}
}
