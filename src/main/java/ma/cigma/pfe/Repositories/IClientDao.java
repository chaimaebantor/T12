package ma.cigma.pfe.Repositories;

import ma.cigma.pfe.Models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDao extends CrudRepository<Client,Long>
{

//Client save(Client c);

//Client findById(long id);

    //List<Client> findByName(String name);

}
