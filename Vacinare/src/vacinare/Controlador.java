
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
                    file.write("Animal: " + animal.toString());
                }
            } else {
                
            }
        } catch (Exception e) {
            
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
