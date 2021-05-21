package ru.mts.sales.backend.db.mb;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product_mb")
public class ProductMb implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    private String code;
    String name;
    private String numberType;
    private String service1;
    private String accountNumber;
    private String packages;
    private String sale;
    private String balance;
    private String price;
    private String blocking;
    private String comment;
    private String tarif;
    private String begin;
    private String end;
    private String orderRestriction;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductMb)) return false;

        ProductMb productMb = (ProductMb) o;

        return code != null ? code.equals(productMb.code) : productMb.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
