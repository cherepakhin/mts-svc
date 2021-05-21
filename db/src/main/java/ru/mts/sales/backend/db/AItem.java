package ru.mts.sales.backend.db;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import java.math.BigDecimal;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AItem {
    Integer count = 0;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal price = BigDecimal.ZERO;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal amount = BigDecimal.ZERO;
}
