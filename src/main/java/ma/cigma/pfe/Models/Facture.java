package ma.cigma.pfe.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity

public class Facture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="CDATE")
    private Date date;
    @Column
    private Double amount;
    private String description;

   public Facture(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }
    public Double getAmount() {
        return amount;
    }
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


  public Facture(long id, Date date, Double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public Facture(Double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Facture(Double amount, String description, Client client) {
        this.amount = amount;
        this.description = description;
        this.client = client;
    }

    public Facture()
    {

    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
