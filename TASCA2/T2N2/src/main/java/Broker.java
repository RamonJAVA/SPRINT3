import java.util.ArrayList;

public class Broker implements Observable{
    private String name;
    private ArrayList<Observer> agencies;
    private double change;

    public Broker(String name) {
        this.name = name;
        this.agencies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
        notifyAgencies();
    }

    @Override
    public void addAgency(Observer agency) {
        agencies.add(agency);
        System.out.println("Agency added.");
    }

    @Override
    public void removeAgency(Observer agency) {
        agencies.remove(agency);
        System.out.println("Agency removed.");
    }

    @Override
    public void notifyAgencies() {
        for (Observer agency : agencies){
            agency.numericChange(change);
        }
    }
}
