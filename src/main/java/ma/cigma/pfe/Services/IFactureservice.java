package ma.cigma.pfe.Services;

import ma.cigma.pfe.Models.Facture;

import java.util.List;

public interface IFactureservice {

    Facture save(Facture f);
    Facture modify(Facture newFacture);
    void removeById(long id);
    Facture getById(long id);
    List<Facture> getAll();

}
