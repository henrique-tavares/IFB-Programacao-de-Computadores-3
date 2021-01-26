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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pc3.trabalho4.dto.DependenteDTO;
import pc3.trabalho4.services.DependenteService;

@RestController
@RequestMapping("/api/v1/dependentes")
public class DependenteResource {

    @Autowired
    private DependenteService service;

    @GetMapping
    public ResponseEntity<List<DependenteDTO>> findAll(@RequestParam(name = "empregado", required = false) String cpf) {
        List<DependenteDTO> list = (cpf == null) ? service.findAll() : service.findByEmpregado(cpf);

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<DependenteDTO> findByCodigo(@PathVariable Integer codigo) {
        DependenteDTO dto = service.findByCodigo(codigo);

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<DependenteDTO> insert(@RequestBody DependenteDTO dto) {
        dto = service.insert(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<DependenteDTO> update(@PathVariable Integer codigo, @RequestBody DependenteDTO dto) {
        dto = service.update(codigo, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> delete(@PathVariable Integer codigo) {
        service.delete(codigo);

        return ResponseEntity.noContent().build();
    }
}
