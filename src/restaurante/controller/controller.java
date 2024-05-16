package restaurante.controller;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/Restaurante Sem Tloca")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> buscarTodos() {
        List<PedidoDTO> pedidos = service.buscarTodos();
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> buscarPorId(@PathVariable Long id) {
        Optional<PedidoDTO> pedido = service.buscarPorId(id);
        return pedido.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/pedido")
    public ResponseEntity<List<PedidoDTO>> buscarPorPedido(@RequestParam String pedido) {
        List<PedidoDTO> pedidos = service.buscarPorPedido(pedido);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<PedidoDTO>> buscarPorCliente(@RequestParam String cliente) {
        List<PedidoDTO> pedidos = service.buscarPorCliente(cliente);
        return ResponseEntity.ok(pedidos);
    }

    @PostMapping("/prato")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PedidoDTO> cadastrar(@Valid @RequestBody PedidoDTO prato) {
        PedidoDTO novoPrato = service.cadastrar(prato);
        return ResponseEntity.ok(novoPrato);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoDTO> alterarPedido(@PathVariable Long id, @Valid @RequestBody PedidoDTO pedidoAlterado) {
        Optional<PedidoTO> pedidoAtualizado = service.alterar(id, pedidoAlterado);
        return pedidoAtualizado.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPedido(@PathVariable Long id) {
        if (!service.deletar(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
