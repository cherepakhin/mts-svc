package ru.mts.sales.backend.db.stv;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.ABCGroup;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product_stv")
public class ProductStv implements Serializable {
    @Id
    private String position;
    private String name = "";
    private String category = "";
    private String shortName = "";
    private ABCGroup group = ABCGroup.A;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductStv)) return false;

        ProductStv that = (ProductStv) o;

        return position != null ? position.equals(that.position) : that.position == null;
    }

    @Override
    public int hashCode() {
        return position != null ? position.hashCode() : 0;
    }
}
