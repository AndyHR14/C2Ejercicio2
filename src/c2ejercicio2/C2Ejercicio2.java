/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class C2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que solicita la nota final del curso anterior e indica si aprobó o no
        int nota;
        String respuesta = JOptionPane.showInputDialog("Digite la nota obtenida");
        nota = Integer.parseInt(respuesta);
        if (nota <= 70){
            JOptionPane.showMessageDialog(null, "No pasó el curso");
        } else {
            JOptionPane.showMessageDialog(null, "Sí pasó el curso!!!!");
        }
    }
}
