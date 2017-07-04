package vacinare;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class AnimalCellRenderer extends DefaultListCellRenderer {
    private Object selecionado;
    public Object getSelecionado() {
        return selecionado;
    }
    @Override
    public Component getListCellRendererComponent(
        JList<?> list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);      
            selecionado = value;
            if(selecionado instanceof Animal){
                Animal animal = (Animal) selecionado;
                System.out.println(selecionado);
                setText(String.valueOf(animal.getNumero()));
            }else if(selecionado == null){
                setText("Selecione...");
            }
            return this;    
        }
}
