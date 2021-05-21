package ru.mts.sales.backend.db.stv;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * История продаж
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "sales_history_stv")
public class SalesHistoryStv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ElementCollection
    @CollectionTable(name = "sales_history_week_data", joinColumns = @JoinColumn(name = "id"))
    List<Integer> weekData;
    @ManyToOne
    AgreementStv agreement;
    Integer month = 0;
    @ElementCollection
    @CollectionTable(name = "sales_history_month_data", joinColumns = @JoinColumn(name = "id"))
    List<Integer> monthData;
    Integer sales = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesHistoryStv)) return false;

        SalesHistoryStv that = (SalesHistoryStv) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
