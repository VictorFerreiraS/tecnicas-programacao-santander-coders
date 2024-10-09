package org.example;

import java.math.BigDecimal;

public class Compra {
    BigDecimal valor;
    Integer numerodeParcelas;

    public Compra(BigDecimal valor, Integer numerodeParcelas) {
        this.valor = valor;
        this.numerodeParcelas = numerodeParcelas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getNumerodeParcelas() {
        return numerodeParcelas;
    }
}
