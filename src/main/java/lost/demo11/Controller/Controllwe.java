package lost.demo11.Controller;

import lost.demo11.Entity.Funcionario;
import lost.demo11.Repository.RepositoryFuncionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class Controllwe {

    @Autowired
    private RepositoryFuncionario funcionarioRepository;


    @PostMapping
    @ResponseBody
    public Funcionario create(@RequestBody Funcionario funcionario){
        Funcionario funcionarioSaved = funcionarioRepository.save(funcionario);
        return funcionarioSaved;
    }
    @GetMapping("{id}")
    @ResponseBody
    public Optional<Funcionario> getFuncionarioById(@PathVariable Long id){
        Optional<Funcionario> funcionarioReturned = funcionarioRepository.findById(id);
        return funcionarioReturned;
    }

    @GetMapping
    public List<Funcionario> getAllClients() {
        return funcionarioRepository.findAll();
    }
    @DeleteMapping ("{id}")
    public String deleteClienteById(@PathVariable Long id){
        Optional<Funcionario>clienteOptional = funcionarioRepository.findById(id);
        if(clienteOptional.isPresent()){
            funcionarioRepository.deleteById(id);
            return "funcionario do id"+id+ "foi deletado com sucesso!";


        }
        else{
            return "funcionario  inexistente!";
        }

    }
    @PutMapping(value = "{id}/")
    public String updateFuncionarioById(@PathVariable Long id,@RequestBody Double salarioNovo){
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(id);
        if(funcionarioOptional.isPresent()){
            Funcionario f = funcionarioOptional.get();
            funcionarioRepository.save(f);
            return "funcionario do id " + id + " salario salvo com sucesso!";
        }
        else{
            return"funcionario  inixistente";
        }
    }

}
