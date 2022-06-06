package thisKeyword;

public class Student {

private String email;
private char section;
private int age;
public int score;

public Student (String email,char section){
    this.email=email;
    this.section=section;

}

//Constructor
    public Student(String email,char section,int age){
    this(email,section);//calling constructor inside the constructor
        //here we are trying to say that plz inilized the pass loacl vaiable i.e the parameter passed in constructor
        //that are loacl varible to the instance vaible of newly crated object
        this.age=age;
    }

 //getter an setters
 public String getEmail() {
        return this.email;
 }

 public char getSection() {
        return this.section;
    }
    public int getAge() {
        return this.age;
    }

public void setEmail(String email){
    //****as we use THIS key to refer the instance variable of an object
    this.email=email;

}
    public void setSection(char section){
        //****we can use THIS key to refer method also
        this.getEmail();
        //****as we use THIS key to refer the instance variable of an  current object
        //THIS key specific to object
        //static to class
        this.section=section;

    }
    public void setEmail(int age){
        this.age=age;

    }

    public void printHashCode(){

        System.out.println(this);
        System.out.println(" ");
        ScoreCalculator.calculate(this);
        new ScoreBoard(this);
    }

    public void increaseScore(int score){

    this.score+=score;

    }

    public Student getModified(String email,char section,int age){
        this.email=email;
        this.section=section;
this.age=age;
return this;


    }

}
