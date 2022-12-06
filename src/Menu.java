import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu implements MenuInter{
    private String foodName;
    private double wight;
    private double price;

    public Menu(String foodName, double wight, double price) {
        this.foodName = foodName;
        this.wight = wight;
        this.price = price;
    }

    public Menu() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "foodName='" + foodName + '\'' +
                ", wight=" + wight +
                ", price=" + price +
                '}';
    }

    @Override
    public List<Menu> getAllMenu(List<Menu> menu) {
        return menu;
    }

    @Override
    public void sortByPrice(List<Menu> menu) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Press 1 to sort by  ascending\n Press 2 to sort by descending ");
        switch (scanner.nextInt()){
            case 1:
                menu.sort(Menu.sortBYPriceAs);
                System.out.println(menu);
                break;
            case 2:
                menu.sort(Menu.sortBYPriceDes);
                System.out.println(menu);
                break;
        }

    }
    public static Comparator<Menu>sortBYPriceAs= new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return (int) o1.price-(int) o2.price;
        }
    };
    public static Comparator<Menu> sortBYPriceDes=new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return (int) o2.price-(int) o1.price;
        }
    };

    @Override
    public void findFoodByName(List<Menu> menu) {
        Scanner scanner =new Scanner(System.in);
        for (Menu m:menu) {
           if (m.getFoodName().trim().toLowerCase().contains(scanner.nextLine().trim().toLowerCase())){
               System.out.println(m);
           }
        }
    }
}
