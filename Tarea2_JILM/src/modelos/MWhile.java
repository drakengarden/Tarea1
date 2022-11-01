/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MWhile {
    private double suma;
    private int aprobados;
    private double saldo;
    private int cantCuotas;

    public MWhile(double suma, int aprobados, double saldo, int cantCuotas) {
        this.suma = suma;
        this.aprobados = aprobados;
        this.saldo = saldo;
        this.cantCuotas = cantCuotas;
    }
    
    public int perfecto(int num) {
        int sum = 0;
        int canDiv = 1;
        while (canDiv < num) {
            if (num % canDiv == 0) {
                sum += canDiv;
            }
            canDiv++;
        }
        return sum;
    }
    
    public int contarVocales(String oracion) {
        int cont = 0, i = 0;
        char vocales[] = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        while (i < oracion.length()) {
            for (int j = 0; j < 10; j++) {
                if (oracion.toLowerCase().charAt(i) == vocales[j]) {
                    cont++;
                }
            }
            i++;
        }
        return cont;
    }
    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public int getAprobados() {
        return aprobados;
    }

    public void setAprobados(int aprobados) {
        this.aprobados = aprobados;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    
    public double sumar (ArrayList<Double> lista) {
        int i = 0;
        while (i < lista.size()) {
            if (lista.get(i) != -1)
            {
                this.suma += lista.get(i);
            }
            i++;
        }
        return this.suma;
    }
    public void cantidad (ArrayList<Integer> lista) {
        int cont = 0;
        while (lista.get(cont) != -1){
            cont++;
        }
        this.aprobados = cont;
    }
    public int cuotasParaSaldar(ArrayList<Double> lista) {
        int i = 0;
        double suma = 0;
        while (suma < 1000) {
            suma += lista.get(i);
            i++;
        }
        return i;
    }
}
