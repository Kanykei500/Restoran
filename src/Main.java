import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> list = new ArrayList<>(Arrays.asList(
                new Bluda("GrilledVegetables", 500, 800, 10),
                new Bluda("Rice", 350, 200, 5),
                new Bluda("Soups", 400, 250, 25),
                new Bluda("Steak", 1000, 500, 30),
                new Bluda("Pizza", 750, 400, 25),  new Napitki("Water", 80, 1000, 1),
                new Napitki("Lemonade", 250, 500, 5),
                new Napitki("Tea", 150, 700, 10),
                new Napitki("Juice", 400, 1000, 10),
                new Napitki("Cola", 200, 1000, 5),new Disert("Cake",400,200,5),
                new Disert("Cupcake",370,400,10),
                new Disert("Pie",200,500,3),
                new Disert("Pancake",240,600,15),
                new Disert("Cookie",500,400,4), new Salat("GreekSalad",500,500,10),
                new Salat("Caprese",300,200,12),
                new Salat("Ceasar",420,300,15),
                new Salat("Shakarap",650,350,20),
                new Salat("Olive",540,350,10)

                ));

         list.forEach(System.out::println);
         Bluda bluda = new Bluda();
        bluda.create(list);
        Salat salat=new Salat();
        salat.create(list);
        Disert disert=new Disert();
        disert.create(list);
        Napitki napitki=new Napitki();
        napitki.create(list);
        bluda.getAll(list);
        bluda.sortByPrice(list);
        bluda.GetByName(list);



    }
}

