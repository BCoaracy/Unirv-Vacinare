package vacinare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Animal {
    private int numero;
    private String raca;
    private char sexo;
    private String origem;
    private int idade;
    private Boolean prenha;
    private int tempoPrenhes;
    private String causaMorte;
	
    public int getNumero() {
	return numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
	
    public String getRaca() {
	return raca;
    }

    public void setRaca(String raca) {
	this.raca = raca;
    }
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isPrenha() {
		return prenha;
	}
	public void setPrenha(Boolean prenha) {
		this.prenha = prenha;
	}
	public int getTempoPrenhes() {
		return tempoPrenhes;
	}
	public void setTempoPrenhes(int tempoPrenhes) {
		this.tempoPrenhes = tempoPrenhes;
	}
	public String getCausaMorte() {
		return causaMorte;
	}
	public void setCausaMorte(String causaMorte) {
		this.causaMorte = causaMorte;
	}
	
	/*public Animal(int numero, String raca, char sexo, String origem, int idade, boolean prenha, int tempoPrenhes,
			String causaMorte) {
            setNumero(numero);
            setRaca(raca);
            setSexo(sexo);
            setOrigem(origem);
            setIdade(idade);
            setPrenha(prenha);
            setTempoPrenhes(tempoPrenhes);
            setCausaMorte(causaMorte);    
	}*/
        /*
        sql.executeQuery = ("INSERT INTO 'vacinacaobd'.'tbanimais'('idtbAnimais','Raca','Peso','Sexo','Origem',"
                + "'Idade','Prenha','TempoPrenhes','CausaMorte','Numero')";
VALUES
(<{idtbAnimais: }>,
<{Raca: }>,
<{Peso: }>,
<{Sexo: }>,
<{Origem: }>,
<{Idade: }>,
<{Prenha: }>,
<{TempoPrenhes: }>,
<{CausaMorte: }>,
<{Numero: }>);*/

    void setSexo(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
