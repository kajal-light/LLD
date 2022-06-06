package builderPattern;

public  class PhoneBuilder {

    private final String os;
    private final int ramSize;
    private final String processor;
    private  double screenSize;
    private  int battery;
//if filed are mandatoy then crete constructor as well
    //you can make that cons private also
    //builder class better to make satic

    //moving intermidate class that holds the agr:inner  static  class
    //chaining

    public PhoneBuilder(String os, int ramSize, String processor) {
        this.os = os;
        this.ramSize = ramSize;
        this.processor = processor;
        this.screenSize = 0;
        this.battery = 0;
    }




    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }


    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

public Phone build(){

        return new Phone( this);
}





}
