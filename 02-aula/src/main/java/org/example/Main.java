package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra(BigDecimal.valueOf(1000), 12);
        CompraService compraService = new CompraServiceImpl();

        CompraPacelada compraParcelada = compraService.getCompraParcelada(compra);

        System.out.println(compraParcelada.toString());
    }
}