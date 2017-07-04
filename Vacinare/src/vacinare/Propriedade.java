package vacinare;

public class Propriedade {
    String nome;
    String dono;
    int rebanho;
    String municipio;
    String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getRebanho() {
        return rebanho;
    }

    public void setRebanho(int rebanho) {
        this.rebanho = rebanho;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Nome da propriedade = " + nome + "\nNome do dono = " + dono + "\nRebanho = " + rebanho + "\nuMucipio = " + municipio + 
                "\nEstado = " + estado;
    }
}
