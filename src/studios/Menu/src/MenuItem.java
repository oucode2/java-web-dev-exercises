import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date added;



MenuItem (double price, String description, String category) {

    this.price = price;
    this.description = description;
    this.category = category;
    this.isNew = true;
    this.added = new Date();
}

public void setPrice (double price) {
    this.price = price;

}

public void setDescription(String description) {

    this.description = description;
}

public void setCategory (String category) {
    this.category = category;
}

public double getPrice () {
    return this.price;
}

}