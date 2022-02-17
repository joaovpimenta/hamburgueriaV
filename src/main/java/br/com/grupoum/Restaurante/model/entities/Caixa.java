package br.com.grupoum.Restaurante.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caixa")
    private Long id;
    @Column(name = "VALORTOTAL_CAIXA")
    private BigDecimal valorTotal;

    public Caixa() {

    }

    public Caixa(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}
