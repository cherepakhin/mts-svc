package ru.mts.sales.backend.db;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User implements Serializable {
    @Id
    String ppoUserId; // ppoUserId
    @ManyToOne
    Client client; // dealer_id

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return ppoUserId != null ? ppoUserId.equals(user.ppoUserId) : user.ppoUserId == null;
    }

    @Override
    public int hashCode() {
        return ppoUserId != null ? ppoUserId.hashCode() : 0;
    }
}
