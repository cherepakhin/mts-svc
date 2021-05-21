package ru.mts.sales.backend.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public abstract class AOrder {
    String orderNumber = "";
    OrderStatus status = OrderStatus.DRAFT;
    Date creationDate = new Date();
    String comment = "";
    boolean emailNotification = true;
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal amount = BigDecimal.ZERO;
    @ManyToOne
    Warehouse warehouse;
    @ManyToOne
    Payment payment;
    @ManyToOne
    User author;
}
