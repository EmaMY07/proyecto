package com.proyecto.app.spring.DTO;

import com.proyecto.app.spring.entity.Producto;

import java.math.BigDecimal;
import java.sql.Date;

public class ComprobantesDTO {
    private Long id;
    private String producto;
    private Date fechaCompro;
    private BigDecimal totalCompro;

    public ComprobantesDTO() {
    }

    public ComprobantesDTO(Long id, String producto ,Date fechaCompro,BigDecimal totalCompro){
        this.id=id;
        this.producto=producto;
        this.fechaCompro=fechaCompro;
        this.totalCompro=totalCompro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFechaCompro() {
        return fechaCompro;
    }

    public void setFechaCompro(Date fechaCompro) {
        this.fechaCompro = fechaCompro;
    }

    public BigDecimal getTotalCompro() {
        return totalCompro;
    }

    public void setTotalCompro(BigDecimal totalCompro) {
        this.totalCompro = totalCompro;
    }
}
