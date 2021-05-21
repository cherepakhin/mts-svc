package ru.mts.sales.backend.db.stv;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.AAgreement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "agreement_stv")
public class AgreementStv extends AAgreement {
    @Id
    String ppoAgreementId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgreementStv)) return false;

        AgreementStv that = (AgreementStv) o;

        return ppoAgreementId != null ? ppoAgreementId.equals(that.ppoAgreementId) : that.ppoAgreementId == null;
    }

    @Override
    public int hashCode() {
        return ppoAgreementId != null ? ppoAgreementId.hashCode() : 0;
    }
}
