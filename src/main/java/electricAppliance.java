import java.util.Date;

public class electricAppliance extends Appliance {
    public electricAppliance(String name) {
        super(name);
    }

    public electricAppliance(String name, Date purchaseDate) {
        super(name, purchaseDate);
    }

    public electricAppliance(String name, Date purchaseDate, int usefulLife) {
        super(name, purchaseDate, usefulLife);
    }
}
