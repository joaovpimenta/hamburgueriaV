package br.com.grupoum.Restaurante.model.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Mesa {


    // Chave primária(obrigatoria) não nula
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer posicao;

    private Boolean status;



//    // Uma mesa pode possuir vários produtos
//    @OneToMany
//    @JoinColumn(name = "id_produtos")
//    private List<Produtos> produtos;

    public Mesa() {
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    // Implementação Obrigatória

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return id.equals(mesa.id) && Objects.equals(posicao, mesa.posicao) && Objects.equals(status, mesa.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, posicao, status);
    }
}
