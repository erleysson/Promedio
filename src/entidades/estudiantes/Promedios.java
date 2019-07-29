package entidades.estudiantes;

import javax.swing.*;

import static entidades.Mensajes.*;


public class Promedios {


    private double notaSeguimiento;
    private double notaParcial;
    private double notaFinal;

    public double getNotaSeguimiento() {


        return notaSeguimiento;
    }

    public void setNotaSeguimiento(double notaSeguimiento) {
        this.notaSeguimiento = notaSeguimiento;

    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public  double calcularPromedio(){
        return ((this.getNotaSeguimiento()*0.40) + (this.getNotaParcial()*0.30) + (this.getNotaFinal()*0.30));


    }

    public double mensajePromedio(){
        if (this.calcularPromedio()<=0.9)
        {
            JOptionPane.showMessageDialog(null,
                    MENSAJE_D.getMensajes());
        }
        else
        {
            if (this.calcularPromedio()<=1.9)
            {
                JOptionPane.showMessageDialog(null,
                        MENSAJE_I.getMensajes());
            }



        {
            if (this.calcularPromedio()>=1.9 && this.calcularPromedio()<=2.9)
            {
                JOptionPane.showMessageDialog(null,
                        MENSAJE_A.getMensajes());
            }

        }


        {
            if ((this.calcularPromedio()>=3.0 && this.calcularPromedio()<=3.9))
            {
                JOptionPane.showMessageDialog(null,
                        MENSAJE_S.getMensajes());
            }

        }


            if ((this.calcularPromedio() >= 4.0) && (this.calcularPromedio() <= 5.0))
            {
                JOptionPane.showMessageDialog(null,
                        MENSAJE_E.getMensajes());
            }

        }
        return calcularPromedio();
    }




}

