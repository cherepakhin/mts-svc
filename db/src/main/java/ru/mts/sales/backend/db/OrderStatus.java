package ru.mts.sales.backend.db;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    COMPLETED("Завершен"),
    CANCELED("Отменен"),
    DELETED("Удален"),
    WAIT("Ожидание оплаты"),
    DRAFT("Черновик");

    private final String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
