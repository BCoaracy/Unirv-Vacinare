package vacinare;

public class Vacina {
    String vacina;
    String tipoVacina;
    int lote;
    String validade;
    int estoque;

    public String getVacina() {
        return vacina;
    }

    @Override
    public String toString() {
        return "Nome da vacina = " + vacina + "\nTipo da vacina = " + tipoVacina + ", lote=" + lote + ", validade=" + validade + ", estoque=" + estoque + '}';
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
