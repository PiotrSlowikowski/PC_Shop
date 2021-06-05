package pl.company.model;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotEmpty
    private String partName;

//    @NotEmpty
    private int partQuantity;

//    @NotNull
    private int partPrice;

    public Part() {

    }

    public Part(String partName, int partQuantity, int partPrice) {

        this.partName = partName;
        this.partQuantity = partQuantity;
        this.partPrice = partPrice;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getPartName() {

        return partName;
    }

    public void setPartName(String partName) {

        this.partName = partName;
    }

    public int getPartQuantity() {

        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {

        this.partQuantity = partQuantity;
    }

    public int getPartPrice() {

        return partPrice;
    }

    public void setPartPrice(int partPrice) {

        this.partPrice = partPrice;
    }

}
