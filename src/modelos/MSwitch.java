/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MSwitch {
    
    public int grupoMes (String mes){
        switch(mes){
            case "Enero": return 31;
            case "Febrero": return 28;
            case "Marzo": return 31; 
            case "Abril": return 30;
            case "Mayo": return 31;
            case "Junio": return 30;
            case "Julio": return 31;
            case "Agosto": return 31;
            case "Septiembre": return 30;
            case "Octubre": return 31;
            case "Noviembre": return 30;
            case "Diciembre": return 31;
            
            case "enero": return 31;
            case "febrero": return 28;
            case "marzo": return 31; 
            case "abril": return 30;
            case "mayo": return 31;
            case "junio": return 30;
            case "julio": return 31;
            case "agosto": return 31;
            case "septiembre": return 30;
            case "octubre": return 31;
            case "noviembre": return 30;
            case "diciembre": return 31;
            default: return 1;
        }
        
    }
    
   public String epocaMes(int mes1){
       switch(mes1){
           case 1: return "Invierno";
           case 2: return "Invierno";
           case 3: return "Primavera";
           case 4: return "Primavera";
           case 5: return "Primavera";
           case 6: return "Verano";
           case 7: return "Verano";
           case 8: return "Verano";
           case 9: return "Otoño";
           case 10: return "Otoño";
           case 11: return "Otoño";
           case 12: return "Invierno";
           default: return "Ingrese un mes valido";  
       }
   } 
    public int cantDias(int mes2){
        switch(mes2){
           case 1: return 31;
           case 2: return 28;
           case 3: return 31;
           case 4: return 30;
           case 5: return 31;
           case 6: return 30;
           case 7: return 31;
           case 8: return 31;
           case 9: return 30;
           case 10: return 31;
           case 11: return 30;
           case 12: return 31;
           default: return 0;
        }
    }
    public int parImpar(int numero){
        int residuo=numero%2;
        switch(residuo){
            case 0: return 1;
            default: return 0;
        }
    }
    
    public double numRaiz(double rnum, int exp){
        double raiz= Math.pow(rnum, 1.0d/exp);
        return raiz;
        
    }
    
    public int divisionEntera(int ent1, int ent2){
      int residuo=ent1%ent2;
      return residuo;
    }
    
    public double numsMenor(int cant){
        
        double arreglo[]=new double[cant];
        double menor;
         for(int i=0;i<cant;i++){
                arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog("Numero en la posicion no."+i));
            }
         
        menor=arreglo[0];
        
        for(int i=0;i<cant;i++){
            if(arreglo[i]<menor){
                menor=arreglo[i];
            }
                
            
        }
        return menor;
    } 
            
    }
    
    

