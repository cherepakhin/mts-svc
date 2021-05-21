package ru.mts.sales.backend.db;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

public abstract class AAgreement implements Serializable {
    @Enumerated(EnumType.STRING)
    TypeAgreement type = TypeAgreement.SatTV;
    //todo ?
    Integer availableOrderSize = 0;
    //todo ?
    String cluster = "";
    //todo есть в Dealer
    String ppoUserId = "";
    //todo ?
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal availableCredit = BigDecimal.ZERO;
    @ManyToOne
    Client client;
    String name = "";
    //todo ?
    String provCode = "";
    //todo enum?
    String salesChannel = "";
    @Column(columnDefinition = "DECIMAL(7,2)")
    BigDecimal balance = BigDecimal.ZERO;
    //todo Есть TypeAgreement
    String direction = "";
    //todo ?
    String status = "";
    //todo ? Баланс_Юг
    String territory = "";
}
