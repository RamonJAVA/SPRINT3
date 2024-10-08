public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker("Broker1");

        Agency agency1 = new Agency("Agency1");
        Agency agency2 = new Agency("Agency2");
        Agency agency3 = new Agency("Agency3");

        broker.addAgency(agency1);
        broker.addAgency(agency2);
        broker.addAgency(agency3);
        broker.removeAgency(agency2);

        broker.setChange(1.3);
        broker.setChange(-3.5);
        broker.setChange(150);
    }
}
