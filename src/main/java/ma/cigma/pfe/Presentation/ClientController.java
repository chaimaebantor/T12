package ma.cigma.pfe.Presentation;

import ma.cigma.pfe.Models.Client;
import ma.cigma.pfe.Services.IClientservice;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IClientservice service;

    public ClientController(IClientservice service) {
        this.service = service;
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt) {
        return service.modify(clt);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long idClt) {
        service.remove(idClt);
    }
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return service.getOne(idClt);
    }
    @GetMapping("all")
    public List<Client> getAll() {
        return service.getAll();
    }



}
