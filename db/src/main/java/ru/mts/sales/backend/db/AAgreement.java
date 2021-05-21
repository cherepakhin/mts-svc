package ru.mts.sales.backend.db;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

public abstract class AAgreement implements Serializable {
    @Enumerated(EnumType.STRING)
    TypeAgreement type = TypeAgreement.SatTV;
    Integer availableOrderSize;
    String cluster = "";
    String ppoUserId = "";
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal availableCredit = BigDecimal.ZERO;
    @ManyToOne(fetch = FetchType.EAGER)
    Dealer dealer = new Dealer();
    String name = "";
    String provCode = "";
    String salesChannel = "";
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal balance = BigDecimal.ZERO;
    String direction = "";
    String status = "";
    String territory = "";
}
