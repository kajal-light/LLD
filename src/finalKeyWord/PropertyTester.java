package finalKeyWord;

public class PropertyTester {

    public static void main(String[] args) {
final Property prop=new Property(100.0,50.0);
//prop.investment=9.0;//it will not allow you to change

//prop=new Property(40.0,70.0);---for if your prop is not final

//NOW THE PROB POINTER POINT TO THE NEW OBJECT THAT HAS 40 AND 70
//MY PROP OBJECT IS NOT FINAL
//********
       // Property prop1=new Property(109.0,88.0);
        Property prop1=prop;
        //its mean that we have only one object but we have two pointer that points to the same object
//****prop1.investment=99.0;//we made un-final of investment so we baled to change this field

 // so can this change reflect in prop pointer also?????
 //ANS IS YES..
 prop1=new Property(prop.bankBalance,prop.investment)  ;
//here prop1 points to the new object so in this if you made any change in field the it will not refct in prop

    }
}
//prop----[100.0,50.0],his instance vai can not change ,immutable object
//prop--->>>>>>>>[40,70]
//if all vairble are final s the object are immutable