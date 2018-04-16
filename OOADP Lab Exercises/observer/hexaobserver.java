
import java.util.*;

public class hexaobserver extends observer {

    public hexaobserver(Subject subject) {
 this.subject = subject;
 this.subject.attach(this);
    }
    public void update() {
     System.out.println("binary string:"+Integer.toHexString(subject.getstate()));
    }

}
