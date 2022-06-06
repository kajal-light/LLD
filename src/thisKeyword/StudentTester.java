package thisKeyword;

public class StudentTester {
    public static void main(String[] args) {
    Student s1=new Student("xyz@",'a',34) ;
    s1.getEmail();//by using THIS keyword i am explicitly say i want to access thai email field of the object which used to invoke this method i.e s1
    //out side of the student class we are accessing the object instance vairble by using the pointer
    //inside the class we are accesing the variable using THIS key



        Student s2=new Student("xyd@",'a',32) ;
//      //  System.out.println(s1 +" "+ s2);
//s1.printHashCode();//inside this method we used THIS KeyWord which refer the current object i.e s1 or s2
//s2.printHashCode();

//****meaing of THIS KEY is the same meaning like the pointer s1 or s2 does
//****as we use THIS key to refer the instance vailbe of an object
//****we can use THIS key to refer method also
 // ScoreCalculator.calculate(s1);
ScoreBoard s3=new ScoreBoard(s1);
//METHOD CHAINING

        //if i am return object then i can perform any method operation by calling them

        //like our pointer s1 has all three filed and over that we can call get method or any method
int ans=s1.getModified("xyd@",'a',33).getAge();

        System.out.println(ans);

        

    }

}
