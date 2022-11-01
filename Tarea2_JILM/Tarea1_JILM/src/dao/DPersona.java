/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Persona;

/**
 *
 * @author labc205
 */
public class DPersona {
    private ArrayList<Persona> listPersona=new ArrayList<>();

    public DPersona() {
    }

    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
    
    public int agregarPersona(int id,
            String nom, int pre, 
            int exi){
        int b = 0;
        Persona pers = new Persona(id, nom, pre, exi);
        listPersona.add(pers);
        b = 1;
        return b;
    }
    
    public DefaultTableModel getListPers(){
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] ={"ID", "NOMBRES", "PRECIO",
            "EXISTENCIA"};
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        //Estoy usando for each
        for (Persona per: listPersona){
            String reg[] = new String[5];
            reg[0] = ""+per.getId();
            reg[1] = per.getNombre();
            reg[2] = ""+per.getPrecio();
            reg[3] = ""+per.getExistencia();
            
            dtm.addRow(reg);
        }
        return dtm;
    }
  
}
