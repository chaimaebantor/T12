package ma.cigma.pfe.Repositories;

import ma.cigma.pfe.Models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IFactureDao extends CrudRepository<Facture,Long> {


}
