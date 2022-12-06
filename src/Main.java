import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Menu>menus=new ArrayList<>();
        menus.add(new Bluda("Manty",300,220));
        menus.add(new Bluda("lagman",250,250));
        menus.add(new Bluda("Plof",200,200));
        menus.add(new Salat("Alivie",200,150));
        menus.add(new Salat("Gribnoi",150,300));
        menus.add(new Salat("Raduga",220,230));
        menus.add(new Disert("Baklava",90,160));
        menus.add(new Disert("Shokalad",80,140));
        menus.add(new Disert("Morojnoe",150,260));
        menus.add(new Napitki("Limon",300,240));
        menus.add(new Napitki("Kivi,",330,240));
        menus.add(new Napitki("Klubnila",280,220));
        Restoran restoran=new Restoran("Medina","kafeina",menus);
        Scanner scanner=new Scanner(System.in);
        Menu menu= new Menu();
        System.out.println("Welcome our kafeina ");
        while (true){
            kotalag(restoran);
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(restoran.getDescription());
                    break;
                case 2:
                    commands(menus);
                    break;
            }
        }

    }
    public static void kotalag(Restoran restoran){
        System.out.println(restoran.getName());
        System.out.println("""
                              Commands
                              Press 1 to read about us
                              Press 2 to view the menu""");
    }
    public static void menuCatalog(){
        System.out.println("""
                           Press 1 to view all meals
                           Press 2 to find meal by name
                           Press 3 to sort by price""");
    }public static void commands(List<Menu>menuList){
        Scanner scanner =new Scanner(System.in);
        while (true){
            menuCatalog();
            Menu menu=new Menu();
            switch (scanner.nextInt()){
                case 1:
                    menu.getAllMenu(menuList);
                    break;
                case 2:
                    System.out.println(menu.getFoodName());
                    break;
                case 3:
                    menu.sortByPrice(menuList);
                    break;

            }
        }
    }
}