package Factorymethod;

public class Main
{
    public static void main(String[] args) {
        Bmw b1 = new Bmw();
        b1.Car_type();
        b1.battery();
        b1.musicsystem();
        b1.engine();
        b1.pricing();
        b1.discount();
        b1.salesduringtimeperiod();

        Airbus a1 = new Airbus();
        a1.Bus_type();
        a1.battery();
        a1.engine();
        a1.musicsystem();
        a1.pricing();
        a1.discount();
        a1.salesduringtimeperiod();
    }

    public int discount(int i) {
        return i = 2100000;
    }
}
