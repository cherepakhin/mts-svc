package ru.mts.sales.backend.db.mb;

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
@Table(name = "agreement_mb")
public class AgreementMb extends AAgreement {
    @Id
    String ppoAgreementId;

    String TCoefficient = "";
    String accountNumber = "";
    String paymentId = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgreementMb)) return false;

        AgreementMb that = (AgreementMb) o;

        return ppoAgreementId != null ? ppoAgreementId.equals(that.ppoAgreementId) : that.ppoAgreementId == null;
    }

    @Override
    public int hashCode() {
        return ppoAgreementId != null ? ppoAgreementId.hashCode() : 0;
    }
}
