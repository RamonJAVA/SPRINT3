public class Agency implements Observer{
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void numericChange(double change) {
        System.out.println("Agency " + name + ": The market value has changed to: " + change);
    }
}
