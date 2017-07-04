
package vacinare;

import java.util.ArrayList;
import java.io.*;

public class Controlador {
    private ArrayList<Animal> arrayAnimal = new ArrayList<>();
    private ArrayList<Vacina> arrayVacina = new ArrayList<>();
    private ArrayList<Propriedade> arrayPropriedade = new ArrayList<>();
    private ArrayList<Doenca> arrayDoenca = new ArrayList<>(); 

    public void adicionar(Animal animal) {
        arrayAnimal.add(animal);
    }
    
    public void adicionar(Vacina vacina) {
        arrayVacina.add(vacina);
    }
    
    public void adicionar(Propriedade propriedade) {
        arrayPropriedade.add(propriedade);
    }
    
    public void adicionar(Doenca doenca) {
        arrayDoenca.add(doenca);
    }
    
    public ArrayList<Animal> getAnimal() {
        return arrayAnimal;
    }

    public void setArrayAnimal(ArrayList<Animal> arrayAnimal) {
        this.arrayAnimal = arrayAnimal;
    }

    public ArrayList<Vacina> getVacina() {
        return arrayVacina;
    }

    public void setArrayVacina(ArrayList<Vacina> arrayVacina) {
        this.arrayVacina = arrayVacina;
    }

    public ArrayList<Propriedade> getArrayPropriedade() {
        return arrayPropriedade;
    }

    public void setPropriedade(ArrayList<Propriedade> arrayPropriedade) {
        this.arrayPropriedade = arrayPropriedade;
    }

    public ArrayList<Doenca> getArrayDoenca() {
        return arrayDoenca;
    }

    public void setDoenca(ArrayList<Doenca> arrayDoenca) {
        this.arrayDoenca = arrayDoenca;
    }
    
    public void gerarRelatorioAnimais() {
        try {
            OutputStream os = new FileOutputStream("relatorio_animais.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter file = new BufferedWriter(osw);
            
            if (!Controlador.getInstance().arrayAnimal.isEmpty()) {
                file.write("                  Animais cadastrados");
                file.newLine();
                for (Animal animal : Controlador.getInstance().arrayAnimal) {
                    file.write("Animal: ");
                    file.newLine();
                    file.write("Numero =  " +animal.getNumero());
                    file.newLine();
                    file.write("Raça = " + animal.getRaca());
                    file.newLine();
                    file.write("Sexo = " + animal.getSexo());
                    file.newLine();
                    file.write("Idade = " + animal.getIdade());
                    file.newLine();
                    file.write("Prenha = " + animal.isPrenha());
                    file.newLine();
                    file.write("Tempo de gestação = " + animal.getTempoPrenhes());
                    file.newLine();
                    file.write("Vacinado = " + animal.getVacinado());
                    file.newLine();
                }
            } else {
                file.write("Não possui nenhum animal cadastrado!");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel gerar o relatório!");
        }
    }
    
    public void gerarRelatorioVacinas() {
        try {
            OutputStream os = new FileOutputStream("relatorio_animais.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter file = new BufferedWriter(osw);
            
            if (!Controlador.getInstance().arrayVacina.isEmpty()) {
                file.write("                  Vacinas cadastradas");
                file.newLine();
                for (Vacina vacina : Controlador.getInstance().arrayVacina) {
                    file.write("Vacina: ");
                    file.newLine();
                    file.write("Nome = " + vacina.getVacina());
                    file.newLine();
                    file.write("Quantidade em estoque = " + vacina.getEstoque());
                }
            } else {
                file.write("Não possui nenhuma vacina!");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Não foi possível gerar o relatório!");
        }
    }
    
    public void gerarRelatorioRebanho() {
        try {
            OutputStream os = new FileOutputStream("relatorio_rebanho_vacinado.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter file = new BufferedWriter(osw);
            
            if (!Controlador.getInstance().arrayAnimal.isEmpty()) {
                file.write("                  Animais cadastrados");
                file.newLine();
                for (Animal animal : Controlador.getInstance().arrayAnimal) {
                    file.write("Animal: ");
                    if (animal.getVacinado()) {
                        file.newLine();
                        file.write("Numero = " + animal.getNumero());
                        file.newLine();
                        file.write("Vacinado = " + animal.getVacinado());
                    }
                }
            } else {
                file.write("Não possui nenhum animal cadastrado!");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Não foi possível gerar o relatório!");
        }
    }
    
    private static Controlador instance = null;
    public static Controlador getInstance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }
}
