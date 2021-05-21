package ru.mts.sales.backend.db.stv;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.mts.sales.backend.db.Warehouse;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "remain_stock_stv")
public class RemainStockStv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer amount;
    @ManyToOne
    ProductStv product;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal price = BigDecimal.ZERO;
    @ManyToOne
    Warehouse warehouse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RemainStockStv)) return false;

        RemainStockStv that = (RemainStockStv) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
