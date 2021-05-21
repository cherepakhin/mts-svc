package ru.mts.sales.backend.db.stv;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.AItem;

import javax.persistence.*;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "order_item_stv")
public class OrderItemStv extends AItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    ProductStv product;
    @ManyToOne
    @JoinColumn(name = "order_stv_id", nullable = false)
    private OrderStv order;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemStv)) return false;

        OrderItemStv that = (OrderItemStv) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
