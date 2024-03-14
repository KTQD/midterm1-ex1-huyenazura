class MP3 extends Item{
    private int duration;


    public MP3(String name, String ID, int price, int duration) {
        super(name, ID, price);
        this.duration = duration;
    }

    @Override
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
    }
}

