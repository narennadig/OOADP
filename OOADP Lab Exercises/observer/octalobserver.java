
import java.util.*;

public class octalobserver extends observer {

    public octalobserver(Subject subject) {
 this.subject = subject;
 this.subject.attach(this);

    }

    public void update() {
       System.out.println("octal string:"+Integer.toOctalString(subject.getstate()));
    }

}
