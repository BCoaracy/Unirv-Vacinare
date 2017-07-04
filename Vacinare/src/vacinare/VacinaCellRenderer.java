package vacinare;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class VacinaCellRenderer extends DefaultListCellRenderer {
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
            if(selecionado instanceof Vacina){
                Vacina vacina = (Vacina) selecionado;
                System.out.println(selecionado);
                setText(vacina.getVacina() + " " + vacina.getTipoVacina());
            }else if(selecionado == null){
                setText("Selecione...");
            }
            return this;    
        }
}