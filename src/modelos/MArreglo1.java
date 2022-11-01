/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author User
 */
public class MArreglo1 {
    private int size;
    private int arreglo[];
    private int agregado;

    public MArreglo1(int agregado) {
        this.agregado = agregado;
    }
    
    public MArreglo1() {
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public void reservarArreglo() {
        this.arreglo = new int[this.size];
    }

    public int getAgregado() {
        return agregado;
    }

    public void setAgregado(int agregado) {
        this.agregado = agregado;
    }
    
    public void agregarElemento(int elemento) {
        this.arreglo[this.agregado] = elemento;
    }
    
    public int getMayor() {
        int mayor = this.arreglo[0];
        for (int i = 0; i < this.agregado; i++) {
            if (mayor < this.arreglo[i]) {
                mayor = this.arreglo[i];
            }
        }
        return mayor;
    }
    public int getMenor() {
        int menor = this.arreglo[0];
        for (int i = 0; i < this.agregado; i++) {
            if (menor > this.arreglo[i]) {
                menor = this.arreglo[i];
            }
        }
        return menor;
    }
    
    public float promedio() {
        float promedio = 0;
        for (int i = 0; i < this.agregado; i++) {
            promedio += this.arreglo[i];
        }
        promedio = promedio / this.agregado;
        return promedio;
    }
    
}
