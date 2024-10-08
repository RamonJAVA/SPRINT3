public interface Observable {
    void addAgency(Observer observer);
    void removeAgency(Observer observer);
    void notifyAgencies();
}
