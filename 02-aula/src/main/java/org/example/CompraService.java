package org.example;

import java.math.BigDecimal;

public interface CompraService {
    BigDecimal calcularParcelas(Compra compra);
    CompraPacelada getCompraParcelada(Compra compra);
}
