package builderPattern;

public class Shop {

    public static void main(String[] args) {

//Phone p=new Phone();
Phone p=new PhoneBuilder().setOs("hdhd").build();

        System.out.println(p.getOs());
     //   System.out.println(p);//Phone{os='hdhd', ramSize=0, processor='null', screenSize=0.0, battery=0}

    }
//NOTES ----in phone object you need consturcor and getter
    //in builder reqired on mmethod that give the phone object and setter
}
