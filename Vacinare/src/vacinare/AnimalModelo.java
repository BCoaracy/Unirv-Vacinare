package vacinare;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class AnimalModelo extends AbstractListModel implements ComboBoxModel{
    private Animal alAtual;
    
    @Override
    public int getSize() {
        return Controlador.getInstance().getAnimal().size();
    }

    @Override
    public Object getElementAt(int index) {
        return (index != -1)? Controlador.getInstance().getAnimal().get(index):null;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        alAtual = (Animal) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return alAtual;
    }
    
    @Override
    public void addListDataListener(ListDataListener alAtual) {
       
    }

    @Override
    public void removeListDataListener(ListDataListener alAtual) {
      
    }
}