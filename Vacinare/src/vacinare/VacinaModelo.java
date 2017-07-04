package vacinare;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class VacinaModelo extends AbstractListModel implements ComboBoxModel{
    private Vacina vacAtual;
    
    @Override
    public int getSize() {
        return Controlador.getInstance().getVacina().size();
    }

    @Override
    public Object getElementAt(int index) {
        return (index != -1)? Controlador.getInstance().getVacina().get(index):null;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        vacAtual = (Vacina) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return vacAtual;
    }
    
    @Override
    public void addListDataListener(ListDataListener alAtual) {
       
    }

    @Override
    public void removeListDataListener(ListDataListener alAtual) {
      
    }
}