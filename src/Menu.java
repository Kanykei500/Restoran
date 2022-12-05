import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu implements Restoranable {
    private static final Scanner scaner = new Scanner(System.in);
    private String name;
    private int price;
    private int volume;
    private int feedRate;

    public Menu(String name, int price, int volume, int feedRate) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.feedRate = feedRate;
    }

    public Menu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFeedRate() {
        return feedRate;
    }

    public void setFeedRate(int feedRate) {
        this.feedRate = feedRate;
    }

    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                        "price: " + price + "\n" +
                        "volume: " + volume + "\n" +
                        "feedRate: " + feedRate + "\n";
    }

    @Override
    public void create(ArrayList<Menu> menus) {
        String name = scaner.nextLine();
        for (Menu m : menus) {
            if (name.equals(m.name)) {
                System.out.println(m);
                ;

            }


        }

    }

    @Override
    public void remove(ArrayList<Menu> menus) {


    }

    @Override
    public void getAll(ArrayList<Menu> menus) {
        for (Menu menu : menus) {
            System.out.println(menu);

        }

    }

    @Override
    public void sortByPrice(ArrayList<Menu> menus) {

        menus.sort(menuComparator);
        for (Menu menu : menus) {
            System.out.println(menu);
        }


    }


    @Override
    public void GetByName(ArrayList<Menu> menus) {
        menus.sort(menuComparator2);
        for (Menu menu : menus) {
            System.out.println(menu);
        }

    }

    public Comparator<Menu> menuComparator = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Menu> menuComparator2 = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o1.getName().compareTo(o2.getName());
        }


    };
}


