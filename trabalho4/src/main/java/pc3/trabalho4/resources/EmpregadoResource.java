package pc3.trabalho4.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pc3.trabalho4.dto.EmpregadoDTO;
import pc3.trabalho4.services.EmpregadoService;

@RestController
@RequestMapping("/api/v1/empregados")
public class EmpregadoResource {

    @Autowired
    private EmpregadoService service;

    @GetMapping
    public ResponseEntity<List<EmpregadoDTO>> findAll() {
        List<EmpregadoDTO> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<EmpregadoDTO> findByCpf(@PathVariable String cpf) {
        EmpregadoDTO dto = service.findByCpf(cpf);

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<EmpregadoDTO> insert(@RequestBody EmpregadoDTO dto) {
        dto = service.insert(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<EmpregadoDTO> update(@PathVariable String cpf, @RequestBody EmpregadoDTO dto) {
        dto = service.update(cpf, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> delete(@PathVariable String cpf) {
        service.delete(cpf);

        return ResponseEntity.noContent().build();
    }
}
