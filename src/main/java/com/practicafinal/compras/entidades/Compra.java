package com.practicafinal.compras.entidades;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

@Entity
public class Compra {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Cliente cliente;

    @OneToMany
    private Set<ArticuloCompra> articuloCompras;

    private Date fechaCompra;



    public Compra() {

        fechaCompra = Date.from(Instant.now());
    }

    public Compra(Cliente cliente, Set<ArticuloCompra> articuloCompras, Date fechaCompra) {
        this.cliente = cliente;
        this.articuloCompras = articuloCompras;
        this.fechaCompra = fechaCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<ArticuloCompra> getArticuloCompras() {
        return articuloCompras;
    }

    public void setArticuloCompras(Set<ArticuloCompra> articuloCompras) {
        this.articuloCompras = articuloCompras;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
