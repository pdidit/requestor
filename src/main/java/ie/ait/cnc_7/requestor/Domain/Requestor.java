package ie.ait.cnc_7.requestor.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Requestor {
    private String Name;
    private String address;
    private Integer Phone_number;
    private Integer cardNumber;
    private Integer expiryDate;
    private Integer secNumber;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer ID;

    public void setId(Integer  id) {
        this.ID = id;
    }

    public Integer  getId() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        Phone_number = phone_number;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Integer expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getSecNumber() {
        return secNumber;
    }

    public void setSecNumber(Integer secNumber) {
        this.secNumber = secNumber;
    }
}
