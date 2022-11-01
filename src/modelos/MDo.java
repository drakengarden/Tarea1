/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ale05
 */
public class MDo {

    public double prom_1N(double n) {
        double prom;
        int i = 1;
        double suma = 0;
        do {
            suma = suma + i;
            i++;
        } while (i <= n);
        return prom = suma / n;
    }

    public double prom_AB(int a, int b) {
        double prom;
        int i = a;
        int n = 0;
        double suma = 0;
        do {
            suma = suma + i;
            i++;
            n++;
        } while (i <= b);
        return prom = suma / n;
    }

    public boolean num_comp(int n) {
        int i = 1;
        int div = 0;
        do {
            if (n % i == 0) {
                div++;
            }
            i++;
        } while (i <= n);
        return div > 2;
    }

    /*public String contra(String clave){
        
        do{
            
        }while(clave !="abc.1234");
        return 
    }*/
    public double sumaimpar(int i) {
        double suma = 0;
        do {
            if (i % 2 != 0) {
                suma = suma + i;
            }
            i++;
        } while (i <= 200);
        return suma;
    }
}
