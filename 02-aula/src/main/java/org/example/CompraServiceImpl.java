package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class CompraServiceImpl implements CompraService {

    @Override
    public BigDecimal calcularParcelas(Compra compra) {
        int numeroDeParcelas = compra.getNumerodeParcelas();
        BigDecimal valorTotal = compra.getValor();
        System.out.println(numeroDeParcelas);
        if (numeroDeParcelas <= 0 || numeroDeParcelas > 12) {
            throw new IllegalArgumentException("O número de parcelas deve ser entre 0 e 12.");
        }
        BigDecimal numeroDeParcelasDecimal = BigDecimal.valueOf(numeroDeParcelas);
        return valorTotal.divide(numeroDeParcelasDecimal, 2, RoundingMode.CEILING);
    }

    @Override
    public CompraPacelada getCompraParcelada(Compra compra) {
        List<LocalDateTime> datasDePagamento = new ArrayList<>();
        LocalDateTime hoje = LocalDateTime.now();

        for (int i = 1; i <= compra.getNumerodeParcelas(); i++) {
            if (hoje.getDayOfWeek() == DayOfWeek.SATURDAY || hoje.getDayOfWeek() == DayOfWeek.SUNDAY) {
                datasDePagamento.add(hoje.with(TemporalAdjusters.next(DayOfWeek.MONDAY)).plus(Period.ofMonths(i)));
            } else {
                datasDePagamento.add(hoje.plus(Period.ofMonths(i)));
            }
        }

        return new CompraPacelada(calcularParcelas(compra), datasDePagamento);
    }
}
