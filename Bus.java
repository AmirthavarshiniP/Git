package Factorymethod;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Bus implements Automobiles {
    long price = 4500000;
    @Override
    public void battery()
    {
        System.out.println("Batteries checked");
    }
    @Override
    public void engine()
    {
        System.out.println("Engines started");
    }
    @Override
    public void musicsystem()
    {
        System.out.println("Music system on");
    }

    @Override
    public void pricing() {
        System.out.println("The price is: Rs."+price);

    }

    @Override
    public void discount() {
        long discount = (long) (price * 0.6);
        System.out.println("The discounted price of bus is Rs."+discount);

    }

    @Override
    public void salesduringtimeperiod() {
        LocalDate currentDate1 = LocalDate.now();
        LocalDate customDate1 = currentDate1.plus(6, ChronoUnit.MONTHS);
        System.out.println("The sales is from : "+currentDate1+ " to " +customDate1 );
        //System.out.println("The sales is : ");
    }
}

