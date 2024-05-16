package restaurante.com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.api.entity.Produto;
import com.trabalho.api.entity.Tipo;

import java.util.List;
import java.math.BigDecimal;


public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    List<Pedido> findByNomeContaining(String pedido);
 
}