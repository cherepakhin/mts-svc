package ru.mts.sales.backend.db.stv;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.EnumVerificationError;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "verify_error_stv")
public class VerifyErrorStv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    EnumVerificationError type;
    String group = "";
    String label = "";
    String errorDescription = "";
    Integer value = 0;
}
