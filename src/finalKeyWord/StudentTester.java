package finalKeyWord;

import java.util.Date;

public class StudentTester {
    public static void main(String[] args) {
//Primitive type
        final int x=2;
        //x=3;
        final double y=4.0;
        //y=6.0;
        ///non-primitive type
        //NOTE-FOR NON PRIMITIVE TYPE WE ARE ABLE TO SET BCZ WE MADE FINAL TO POINTER NOT THE INSTANCE VAIRBLE
        //SO WE CAN SET BUT WE CAN NOT CREATE THE SAME POINTER THAT POINTS TO THE OTHER OBJECT

        final Date date=new Date();
        //SO WE CAN SET BUT WE CAN NOT CREATE THE SAME POINTER THAT POINTS TO THE OTHER OBJECT
       //**** date=new Date();

        System.out.println(date.getTime());//current system time
        date.setTime(100);
        System.out.println(date.getTime());//100
    }



}
