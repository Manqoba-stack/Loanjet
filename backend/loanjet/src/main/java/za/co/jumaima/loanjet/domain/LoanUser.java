package za.co.jumaima.loanjet.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.validator.constraints.UUID;

import java.sql.Types;
import java.util.Objects;

@Entity
@Table(name="loanuser")
public class LoanUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JdbcTypeCode(value = Types.VARCHAR)
    @Column(length = 36, columnDefinition = "varchar(36)",updatable = false,nullable = false)
    private UUID id;
    private String name;
    private String surname;
    private String phone_number;
    private String email;
    private String address;
    private boolean isLender;

    public LoanUser(){}

    public LoanUser(String name, String surname, String email, String phone_number, String address, boolean isLender)
    {
        this.address=address;
        this.email=email;
        this.phone_number=phone_number;
        this.name=name;
        this.surname=surname;
        this.isLender=isLender;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public boolean isLender() {
        return isLender;
    }

    public void setLender(boolean lender) {
        isLender = lender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanUser loanUser = (LoanUser) o;
        return Objects.equals(id, loanUser.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
