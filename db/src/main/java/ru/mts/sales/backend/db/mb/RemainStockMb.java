package ru.mts.sales.backend.db.mb;

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
@Table(name = "remain_stock_mb")
public class RemainStockMb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer amount;
    @ManyToOne
    ProductMb product;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal price = BigDecimal.ZERO;
    @ManyToOne
    Warehouse warehouse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RemainStockMb)) return false;

        RemainStockMb that = (RemainStockMb) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
