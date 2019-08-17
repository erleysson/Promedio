package main;

import  static entidades.Mensajes.*;
import entidades.estudiantes.Promedios;
import java.text.DecimalFormat;





import javax.swing.*;

public class Main {

    public static void main (String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("##.#");
    Promedios promedios = new Promedios();


    String nota1 = JOptionPane.showInputDialog(null,
            MENSAJE_NOTA_SEGUIMIENTO.getMensajes());



    String nota2 = JOptionPane.showInputDialog(null,
            MENSAJE_NOTA_PARCIAL.getMensajes());

    String nota3 = JOptionPane.showInputDialog(null,
            MENSAJE_NOTA_FINAL.getMensajes());

    promedios.setNotaSeguimiento(Double.parseDouble(nota1));
    promedios.setNotaParcial(Double.parseDouble(nota2));
    promedios.setNotaFinal(Double.parseDouble(nota3));

    JOptionPane.showMessageDialog(null,
            MENSAJE_NOTA1.getMensajes() + nota1 + MENSAJE_NOTA2.getMensajes() + nota2 + MENSAJE_NOTA3.getMensajes()
                    + nota3 + MENSAJE_NOTA_DEFINITIVA.getMensajes() +  decimalFormat.format (promedios.calcularPromedio())+ promedios.mensajePromedio());
    }




}



