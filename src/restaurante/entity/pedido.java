package com.trabalho.api.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurante Sem Tloca")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(pedido = "pedido")
    private Long id;
    private String prato;
    private String cliente;

    public Pedido() {
        // Default constructor
    }

    public Pedido(Long id, String prato, String cliente) {
        this.id = id;
        this.prato = prato;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public String getPedido() {
        return prato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPedido(String prato) {
        this.prato = prato;
    }

    public PedidoDTO toDTO() {
        return new PedidoDTO(this.id, this.prato, this.cliente);
    }
}
