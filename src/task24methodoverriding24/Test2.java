package task24methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        Sbi s= new Sbi();
        ICICI i= new ICICI();
        Axis a= new Axis();
        System.out.println("SBI Rate of Interest:  "+ s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:  "+ i.getRateOfInterest());
        System.out.println("Axis Rate of Interest:  "+ a.getRateOfInterest());

    }
}
