package ru.mts.sales.backend.db.stv;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.Dealer;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "recommended_order_stv")
public class RecommendOrderStv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    AgreementStv agreement;
    String discount = "";
    @ManyToOne
    ProductStv product;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal price = BigDecimal.ZERO;
    Integer count = 0;
    @ManyToOne
    Dealer dealer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecommendOrderStv)) return false;

        RecommendOrderStv that = (RecommendOrderStv) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
