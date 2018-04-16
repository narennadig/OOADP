
import java.util.*;

public class binaryobserver extends observer {

    public binaryobserver(Subject subject) {
 this.subject=subject;
 this.subject.attach(this);
    }

    public void update() {
        System.out.println("binary string:"+Integer.toBinaryString(subject.getstate()));
    }

}
