package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CompraPacelada {
    BigDecimal valorDasParcelas;
    List<LocalDateTime> datasDePagamento;

    public CompraPacelada(BigDecimal valorDasParcelas, List<LocalDateTime> datasDePagamento) {
        this.valorDasParcelas = valorDasParcelas;
        this.datasDePagamento = datasDePagamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compra Parcelada:\n");
        sb.append("Valor das Parcelas: ").append(valorDasParcelas).append("\n");
        sb.append("Datas de Pagamento:\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (LocalDateTime data : datasDePagamento) {
            sb.append("- ").append(data.format(formatter)).append("\n");
        }

        return sb.toString();
    }
}
