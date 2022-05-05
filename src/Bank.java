public class Bank {
    private double penny, nickel, dime, quarter;

    public Bank(double pnny,double nckl,double dm, double q) {
        penny = pnny;
        nickel = nckl;
        dime = dm;
        quarter = q;
    }

    public void getTotal() {
        System.out.println("Penny: " + penny);
        System.out.println("Nickel: " + nickel);
        System.out.println("Dime: " + dime);
        System.out.println("Quarter: " + quarter);
        System.out.println("Total: " + (penny + nickel + dime + quarter));
    }

    public void removeAllCoins() {
        penny = 0;
        nickel = 0;
        dime = 0;
        quarter = 0;
        System.out.println("\nAll coins has been removed.");
    }

    public void setPenny(double qty) {
        penny += qty;
        System.out.println("Penny has been added.");
    }

    public void setNickel(double qty) {
        nickel += qty;
        System.out.println("Nickel has been added.");
    }

    public void setDime(double qty) {
        dime += qty;
        System.out.println("Dime has been added.");
    }

    public void setQuarter(double qty) {
        quarter += qty;
        System.out.println("Quarter has been added.");
    }

    public double getPenny() {
        return penny;
    }

    public double getNickle() {
        return nickel;
    }

    public double getDime() {
        return dime;
    }
    
    public double getQuarter() {
        return quarter;
    }
}
