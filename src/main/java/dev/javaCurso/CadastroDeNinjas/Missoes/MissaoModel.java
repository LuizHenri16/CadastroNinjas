package dev.javaCurso.CadastroDeNinjas.Missoes;

import dev.javaCurso.CadastroDeNinjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missao;
    private String dificulada;

    // Uma missão One pode ter vários / muitos (Many) ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissaoModel() {
    }

    public MissaoModel(String missao, String dificulada) {
        this.missao = missao;
        this.dificulada = dificulada;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getDificulada() {
        return dificulada;
    }

    public void setDificulada(String dificulada) {
        this.dificulada = dificulada;
    }
}
