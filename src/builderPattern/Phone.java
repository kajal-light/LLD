package builderPattern;

public class Phone {

private final String os;
private final int ramSize;
private final String processor;
private final double screenSize;
private final int battery;

    public Phone(PhoneBuilder builders) {
        this.os = builders.os;
        this.ramSize =builders. ramSize;
        this.processor = builders.processor;
        this.screenSize = builders.screenSize;
        this.battery = builders.battery;
    }

  }

