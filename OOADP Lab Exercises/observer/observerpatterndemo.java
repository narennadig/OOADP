
import java.util.*;

public class observerpatterndemo {

    public  static void main(String[] args) {
      Subject subject = new Subject();

      new hexaobserver(subject);
      new octalobserver(subject);
      new binaryobserver(subject);

      System.out.println("First state change: 15");	
      subject.setstate(15);
      System.out.println("Second state change: 10");	
      subject.setstate(10);
}
}

