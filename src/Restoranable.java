import java.util.ArrayList;

public interface Restoranable {

    void   create(ArrayList<Menu>menus);
    void   remove(ArrayList<Menu>menus);

    void getAll(ArrayList<Menu>menus);
     void sortByPrice(ArrayList<Menu>menus);
     void GetByName(ArrayList<Menu>menus);




}
