package ma.cigma.pfe.Models;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(CompanyId.class)

public class Company {
    //@Id
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private long rc;
    @Id
    private long idTribunal;
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;

    @Embedded
    @AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
    private ContactPerson contactPerson;


}
