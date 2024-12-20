package processor;

public class DataStructure {
    private String id;
    private String name;
    private String category;
    private String price;
    private String quantity;

    public DataStructure(String id, String name, String category, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public void setPrice(String price) {this.price = price;}
    public void setQuantity(String quantity) {this.quantity = quantity;}

    public String getId() {return id;}
    public String getName() {return name;}
    public String getCategory() {return category;}
    public String getPrice() {return price;}
    public String getQuantity() {return quantity;}
    @Override
    public String toString() {return id + ", " + name + ", " + category + ", " + price + ", " + quantity;}
}
