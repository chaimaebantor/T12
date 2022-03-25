package ma.cigma.pfe.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@ToString
@Table(name = "Client")

public class Client {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public Client(String name) {
        this.name = name;
    }


    public Client(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Client()
    {

    }
}
