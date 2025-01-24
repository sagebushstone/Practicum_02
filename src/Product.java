//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Product {
    String name;
    String description;
    String ID;
    double cost;

    public Product() {

    }

    public Product(String ID, String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    /**
     * @return - the name of the Product
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return - the description of the Product
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return - the ID of the Product
     */
    public String getID() {
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    /**
     * @return - the cost of the Product
     */
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return - the Product in CSV format
     */
    public String toCSV(){
        return ID + ", " + name + ", " + description + ", " + cost;
    }

    /**
     * @return - the Product in JSON format
     */
    public String toJSON(){
        String Q = "\"";
        String QCM = "\", ";
        String QC = "\": \"";
        return "{" + Q + "ID" + QC + ID + QCM
                + Q + "name" + QC +  name + QCM
                + Q + "description" + QC + description + QCM
                + Q + "cost" + Q + ": " + cost  + "}";
    }

    /**
     * @return - the Product in XML format
     */
    public String toXML(){
        return "<Product>" +
                "<ID>" + ID + "</ID>" +
                "<name>" + name + "</name>" +
                "<description>" + description + "</description>" +
                "<cost>" + cost + "</cost>" + "</Product>";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", cost=" + cost +
                '}';
    }
}
