package javAPPA;
public class Item {

    int id;
    String name;
    String description;

    public Item(int id) {
        this(id, "Appa Item no. " + id);
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setDescription() {
        setDescription("Appa " + id + " description");
    }

    public void setDescription(String description) {
        setDescription(description, "JavAPPa");
    }

    public void setDescription(String description, String author) {
        this.description = description + " created by " + author;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}