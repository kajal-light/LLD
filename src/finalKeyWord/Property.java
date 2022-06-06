package finalKeyWord;

public class Property {

    public final double bankBalance;
    public final double investment;
//constructor create is neceesary for constructor
//you shpould inilized by your self other wise user will create by customer
//if you not inilizing the final vairble then it will set as null and we can not changed after that
    public Property(double bankBalance,double investment){
        this.bankBalance=bankBalance;
        this.investment=investment;


//setters are not allowed
    }

}
