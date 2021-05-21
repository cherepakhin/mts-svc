package ru.mts.sales.backend.db.mb;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.mts.sales.backend.db.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "verify_result_mb")
public class VerifyResultMb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date createDate = new Date();
    @ManyToOne
    private OrderMb order;
    @ManyToOne
    private User user;
    private String version = "";
    @OneToMany
    private List<VerifyErrorMb> errors;
}
