
package vacinare;

import java.util.ArrayList;

public class Controlador {
    private ArrayList<Animal> arrayAnimal = new ArrayList<>();
    private ArrayList<Vacina> arrayVacina = new ArrayList<>();

    public void adicionar(Animal animal) {
        arrayAnimal.add(animal);
    }
    
    public void adicionar(Vacina vacina) {
        arrayVacina.add(vacina);
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
    
    private static Controlador instance = null;
    public static Controlador getInstance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }
}
