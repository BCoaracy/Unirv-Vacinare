package vacinare;

public class Doenca {
    String nome;
    private Vacina vacina;
    String sintomas;
    String campanha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeDoenca) {
        this.nome = nomeDoenca;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
}
