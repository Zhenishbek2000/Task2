import java.util.List;

public class Restoran {
    private String name;
    private String description;
    private List<Menu>menus;

    public Restoran(String name, String description,List<Menu>menus) {
        this.name = name;
        this.description = description;
        this.menus=menus;

    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", menus=" + menus +
                '}';
    }
}
