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
    String code;
    //todo причесать
    String name;
    String numberType;
    String service1;
    String accountNumber;
    String packages;
    String sale;
    String balance;
    String price;
    String blocking;
    String comment;
    String tarif;
    String begin;
    String end;
    String orderRestriction;

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
