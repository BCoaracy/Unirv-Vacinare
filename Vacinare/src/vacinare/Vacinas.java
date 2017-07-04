/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacinare;

/**
 *
 * @author Bruno
 */
public class Vacinas {
    String vacina;
    String tipoVacina;
    int lote;
    String validade;
    int estoque;

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getTipoVacina() {
        return tipoVacina;
    }

    public void setTipoVacina(String tipoVacina) {
        this.tipoVacina = tipoVacina;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
}
