package pl.company.model;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partName;

    private int partPrice;

    private int cartQuantity;

    public Cart() {

    }

    public Cart(String partName, int partPrice, int cartQuantity) {

        this.partName = partName;
        this.partPrice = partPrice;
        this.cartQuantity = cartQuantity;
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


    public int getPartPrice() {

        return partPrice;
    }

    public void setPartPrice(int partPrice) {

        this.partPrice = partPrice;
    }

    public int getCartQuantity() {

        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {

        this.cartQuantity = cartQuantity;
    }

}
