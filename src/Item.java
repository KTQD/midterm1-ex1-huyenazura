public abstract class Item {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    protected String ID;
    float price;

    public Item(String name, String ID, int price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
    }
}
