import java.util.List;

public interface MenuInter {
    List<Menu>getAllMenu(List<Menu>menu);
    void sortByPrice(List<Menu>menu);
    void findFoodByName(List<Menu>menu);

}
